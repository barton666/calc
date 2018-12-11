import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
Класс, обеспечивающий запуск тестов с категорией MultDivCategory, включенных в классы TestMult и TestDiv
*/

@RunWith(Categories.class)
@Categories.IncludeCategory(MultDivCategory.class)
@Suite.SuiteClasses({TestMult.class,TestDiv.class})

public class SuiteMultDivClass {

}
