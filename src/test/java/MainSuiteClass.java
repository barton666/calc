import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
Класс, обеспечивающий запуск всех необходимых тестов
*/

@RunWith(Suite.class)
@Suite.SuiteClasses({SuiteMultDivClass.class, SuiteSumSubClass.class, TestParameterized.class})

public class MainSuiteClass {
}
