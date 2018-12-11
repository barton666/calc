import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SumSubCategory.class)
@Suite.SuiteClasses({TestSum.class, TestSub.class})

public class SuiteSumSubClass {
}
