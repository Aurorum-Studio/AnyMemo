/*
Copyright (C) 2012 Haowen Ning

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

*/
package org.liberty.android.fantastischmemo.downloader.dropbox;

import android.content.Context;

import org.json.JSONException;
import org.liberty.android.fantastischmemo.downloader.DownloadItem;
import org.liberty.android.fantastischmemo.utils.AMFileUtil;
import org.liberty.android.fantastischmemo.utils.RecentListUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DropboxDownloadHelper {

    private final String authToken;

    private static final String METADATA_ACCESS_URL = "https://api.dropbox.com/1/metadata/dropbox/anymemo?list=true";
    private static final String DOWNLOAD_URL = "https://api-content.dropbox.com/1/files/dropbox/anymemo/";

    private final RecentListUtil recentListUtil;

    private AMFileUtil amFileUtil;

    public DropboxDownloadHelper(Context context, RecentListUtil recentListUtil, String authToken) {
        this.authToken = authToken;
        this.recentListUtil = recentListUtil;
    }

    public void setAmFileUtil(AMFileUtil amFileUtil) {
        this.amFileUtil = amFileUtil;
    }

    // Fetch the list of db files
    public List<DownloadItem> fetchDBFileList() throws IOException, JSONException {
        List<DownloadItem> dbFileList = new ArrayList<DownloadItem>();

        // TODO: Stub

        return dbFileList;
    }


    public String downloadDBFromDropbox(DownloadItem di) throws IOException  {
        // TODO: Stub

        return null;
    }
}
