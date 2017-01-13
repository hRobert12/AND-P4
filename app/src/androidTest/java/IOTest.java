import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import com.example.Joker;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotEquals;

@RunWith(AndroidJUnit4.class)
public class IOTest {
    @Test
    public void jokerIO_isCorrect() throws Exception {
        new EndpointsAsyncTask().execute(Pair.create(InstrumentationRegistry.getTargetContext(), "lol"));
        wait(1000);
        while (!Joker.done) {}
        assertNotEquals("", Joker.getJoke());
    }
}
