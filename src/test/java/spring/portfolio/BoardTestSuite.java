package spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardTestSuite {

	@Autowired
	Board board;

	@Qualifier("ToDoList")
	@Autowired
	TaskList taskList1;

	@Qualifier("InProgressList")
	@Autowired
	TaskList taskList2;

	@Test
	void testTaskAdd() {
		//given
		//when
		//then
		System.out.println("getDoneList: " +
				board.getToDoList(taskList1.getTaskToDoList()));
		System.out.println("getInProgressList: " +
				board.getInProgressList(taskList2.getTaskInProgressList()));
		System.out.println("getDoneList: " + board.getDoneList());

		Assertions.assertNotNull(board.getToDoList(taskList1.getTaskToDoList()));
		Assertions.assertNotNull(board.getInProgressList(taskList2.getTaskInProgressList()));
		Assertions.assertNotNull(board.getDoneList());



	}

}
