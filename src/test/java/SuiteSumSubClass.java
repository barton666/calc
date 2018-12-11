import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
Класс, обеспечивающий запуск тестов с категорией SumSubCategory, включенных в классы TestSum и TestSub
*/

@RunWith(Categories.class)
@Categories.IncludeCategory(SumSubCategory.class)
@Suite.SuiteClasses({TestSum.class, TestSub.class})

public class SuiteSumSubClass {
}
