package kata2;

import java.io.IOException;

public class kata2 {

    public static void main(String[] args) throws IOException {
        Integer [] array = {1,2,3,4,5,6,7,5,4,3,2,2,2,2};
        HistrogramBuilder<Integer> builder = new HistrogramBuilder();
        Histogram<Integer> histogram = builder.build(array);
        new HistogramViewer<Integer>().print(histogram);
    }
}
