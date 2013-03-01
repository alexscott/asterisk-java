package org.asteriskjava.live;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HangupCauseTest
{
    @Test
    public void testGetByCode()
    {
        assertEquals("Valid enum for cause code 18", HangupCause.AST_CAUSE_NO_USER_RESPONSE, HangupCause.getByCode(18));
    }

    @Test
    public void testNewCause()
    {
        assertEquals("Valid enum for cause code 5", HangupCause.AST_CAUSE_MISDIALLED_TRUNK_PREFIX, HangupCause.getByCode(5));
        assertEquals("Valid enum for cause code 14", HangupCause.AST_CAUSE_NUMBER_PORTED_NOT_HERE, HangupCause.getByCode(14));
        assertEquals("Valid enum for cause code 20", HangupCause.AST_CAUSE_SUBSCRIBER_ABSENT, HangupCause.getByCode(20));
        assertEquals("Valid enum for cause code 23", HangupCause.AST_CAUSE_REDIRECTED_TO_NEW_DESTINATION, HangupCause.getByCode(23));
        assertEquals("Valid enum for cause code 26", HangupCause.AST_CAUSE_ANSWERED_ELSEWHERE, HangupCause.getByCode(26));
    }
}
