package com.darkguardsman.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 11/20/18.
 */
public class Main {
    static Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        log.debug("Debug message");
        log.info("Info message");
    }
}
