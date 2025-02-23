package ru.usachev63.lamatruffle;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.source.Source;
import ru.usachev63.lamatruffle.parser.LamaLanguageParser;
import ru.usachev63.lamatruffle.runtime.LamaContext;

@TruffleLanguage.Registration(id = "lama", name = "lama")
public final class LamaLanguage extends TruffleLanguage<LamaContext> {
    @Override
    protected LamaContext createContext(Env env) {
        return new LamaContext();
    }

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        Source source = request.getSource();
        return LamaLanguageParser.parseLama(this, source);
    }
}
