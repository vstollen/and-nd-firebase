/**
 * Copyright Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.firebase.udacity.friendlychat;

public class FriendlyMessage {

    private String id;
    private String text;
    private String name;
    private String photoUrl;

    @Override
    public boolean equals(Object obj) {

        // If the object is compared with itself
        if (obj == this) {
            return true;
        }

        // Check if obj is an instance of FriendlyMessage or not
        if (!(obj instanceof FriendlyMessage)) {
            return false;
        }

        // Cast obj to FriendlyMessage
        FriendlyMessage friendlyMessage = (FriendlyMessage) obj;

        // Compare the message id's
        return this.id.equals(friendlyMessage.id);
    }

    public FriendlyMessage() {
    }

    FriendlyMessage(String text, String name, String photoUrl) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
