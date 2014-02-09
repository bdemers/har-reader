package de.sstoehr.harreader.model;

import org.junit.Assert;
import org.junit.Test;

public class HarCreatorBrowserTest extends AbstractMapperTest<HarCreatorBrowser> {

    @Override
    public void testMapping() {
        HarCreatorBrowser creatorBrowser = map("{\"name\":\"aName\",\"version\":\"aVersion\",\"comment\":\"my comment\"}", HarCreatorBrowser.class);

        Assert.assertNotNull(creatorBrowser);
        Assert.assertEquals("aName", creatorBrowser.getName());
        Assert.assertEquals("aVersion", creatorBrowser.getVersion());
        Assert.assertEquals("my comment", creatorBrowser.getComment());

        creatorBrowser = map(UNKNOWN_PROPERTY, HarCreatorBrowser.class);
        Assert.assertNotNull(creatorBrowser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNameNull() {
        HarCreatorBrowser creatorBrowser = new HarCreatorBrowser();
        creatorBrowser.setName(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVersionNull() {
        HarCreatorBrowser creatorBrowser = new HarCreatorBrowser();
        creatorBrowser.setVersion(null);
    }
}
