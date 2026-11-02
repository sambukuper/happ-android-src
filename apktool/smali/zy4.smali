.class public final Lzy4;
.super Landroid/os/Binder;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lj43;


# instance fields
.field public final synthetic g:Landroidx/room/MultiInstanceInvalidationService;


# direct methods
.method public constructor <init>(Landroidx/room/MultiInstanceInvalidationService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzy4;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lj43;->c:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 6

    .line 1
    sget-object v0, Lj43;->c:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-lt p1, v1, :cond_0

    .line 5
    .line 6
    const v2, 0xffffff

    .line 7
    .line 8
    .line 9
    if-gt p1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const v2, 0x5f4e5446

    .line 15
    .line 16
    .line 17
    if-ne p1, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return v1

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    if-eq p1, v1, :cond_a

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    if-eq p1, v3, :cond_7

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    if-eq p1, v2, :cond_2

    .line 32
    .line 33
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    :cond_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lzy4;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 50
    .line 51
    iget-object p3, p0, Landroidx/room/MultiInstanceInvalidationService;->Z:Laz4;

    .line 52
    .line 53
    monitor-enter p3

    .line 54
    :try_start_0
    iget-object p4, p0, Landroidx/room/MultiInstanceInvalidationService;->Y:Ljava/util/LinkedHashMap;

    .line 55
    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {p4, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p4

    .line 64
    check-cast p4, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 65
    .line 66
    if-nez p4, :cond_3

    .line 67
    .line 68
    monitor-exit p3

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    :try_start_1
    iget-object v2, p0, Landroidx/room/MultiInstanceInvalidationService;->Z:Laz4;

    .line 71
    .line 72
    invoke-virtual {v2}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 73
    .line 74
    .line 75
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    :goto_0
    iget-object v3, p0, Landroidx/room/MultiInstanceInvalidationService;->Z:Laz4;

    .line 77
    .line 78
    if-ge v0, v2, :cond_6

    .line 79
    .line 80
    :try_start_2
    invoke-virtual {v3, v0}, Landroid/os/RemoteCallbackList;->getBroadcastCookie(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    check-cast v3, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    iget-object v5, p0, Landroidx/room/MultiInstanceInvalidationService;->Y:Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    invoke-virtual {v5, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    check-cast v3, Ljava/lang/String;

    .line 100
    .line 101
    if-eq p1, v4, :cond_5

    .line 102
    .line 103
    invoke-virtual {p4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    if-nez v3, :cond_4

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    :try_start_3
    iget-object v3, p0, Landroidx/room/MultiInstanceInvalidationService;->Z:Laz4;

    .line 111
    .line 112
    invoke-virtual {v3, v0}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Li43;

    .line 117
    .line 118
    invoke-interface {v3, p2}, Li43;->c([Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catchall_0
    move-exception p1

    .line 123
    goto :goto_2

    .line 124
    :catch_0
    :cond_5
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :goto_2
    :try_start_4
    iget-object p0, p0, Landroidx/room/MultiInstanceInvalidationService;->Z:Laz4;

    .line 128
    .line 129
    invoke-virtual {p0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 130
    .line 131
    .line 132
    throw p1

    .line 133
    :catchall_1
    move-exception p0

    .line 134
    goto :goto_4

    .line 135
    :cond_6
    invoke-virtual {v3}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 136
    .line 137
    .line 138
    monitor-exit p3

    .line 139
    :goto_3
    return v1

    .line 140
    :goto_4
    monitor-exit p3

    .line 141
    throw p0

    .line 142
    :cond_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-nez p1, :cond_8

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_8
    sget-object p4, Li43;->b:Ljava/lang/String;

    .line 150
    .line 151
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 152
    .line 153
    .line 154
    move-result-object p4

    .line 155
    if-eqz p4, :cond_9

    .line 156
    .line 157
    instance-of v0, p4, Li43;

    .line 158
    .line 159
    if-eqz v0, :cond_9

    .line 160
    .line 161
    move-object v2, p4

    .line 162
    check-cast v2, Li43;

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_9
    new-instance v2, Lh43;

    .line 166
    .line 167
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 168
    .line 169
    .line 170
    iput-object p1, v2, Lh43;->g:Landroid/os/IBinder;

    .line 171
    .line 172
    :goto_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iget-object p0, p0, Lzy4;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 180
    .line 181
    iget-object p2, p0, Landroidx/room/MultiInstanceInvalidationService;->Z:Laz4;

    .line 182
    .line 183
    monitor-enter p2

    .line 184
    :try_start_5
    iget-object p4, p0, Landroidx/room/MultiInstanceInvalidationService;->Z:Laz4;

    .line 185
    .line 186
    invoke-virtual {p4, v2}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    .line 187
    .line 188
    .line 189
    iget-object p0, p0, Landroidx/room/MultiInstanceInvalidationService;->Y:Ljava/util/LinkedHashMap;

    .line 190
    .line 191
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    check-cast p0, Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 200
    .line 201
    monitor-exit p2

    .line 202
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 203
    .line 204
    .line 205
    return v1

    .line 206
    :catchall_2
    move-exception p0

    .line 207
    monitor-exit p2

    .line 208
    throw p0

    .line 209
    :cond_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    if-nez p1, :cond_b

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_b
    sget-object p4, Li43;->b:Ljava/lang/String;

    .line 217
    .line 218
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 219
    .line 220
    .line 221
    move-result-object p4

    .line 222
    if-eqz p4, :cond_c

    .line 223
    .line 224
    instance-of v2, p4, Li43;

    .line 225
    .line 226
    if-eqz v2, :cond_c

    .line 227
    .line 228
    move-object v2, p4

    .line 229
    check-cast v2, Li43;

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_c
    new-instance v2, Lh43;

    .line 233
    .line 234
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 235
    .line 236
    .line 237
    iput-object p1, v2, Lh43;->g:Landroid/os/IBinder;

    .line 238
    .line 239
    :goto_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    if-nez p1, :cond_d

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_d
    iget-object p0, p0, Lzy4;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 250
    .line 251
    iget-object p2, p0, Landroidx/room/MultiInstanceInvalidationService;->Z:Laz4;

    .line 252
    .line 253
    monitor-enter p2

    .line 254
    :try_start_6
    iget p4, p0, Landroidx/room/MultiInstanceInvalidationService;->X:I

    .line 255
    .line 256
    add-int/2addr p4, v1

    .line 257
    iput p4, p0, Landroidx/room/MultiInstanceInvalidationService;->X:I

    .line 258
    .line 259
    iget-object v3, p0, Landroidx/room/MultiInstanceInvalidationService;->Z:Laz4;

    .line 260
    .line 261
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    invoke-virtual {v3, v2, v4}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_e

    .line 270
    .line 271
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    iget-object p0, p0, Landroidx/room/MultiInstanceInvalidationService;->Y:Ljava/util/LinkedHashMap;

    .line 276
    .line 277
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move v0, p4

    .line 281
    goto :goto_7

    .line 282
    :catchall_3
    move-exception p0

    .line 283
    goto :goto_9

    .line 284
    :cond_e
    iget p1, p0, Landroidx/room/MultiInstanceInvalidationService;->X:I

    .line 285
    .line 286
    add-int/lit8 p1, p1, -0x1

    .line 287
    .line 288
    iput p1, p0, Landroidx/room/MultiInstanceInvalidationService;->X:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 289
    .line 290
    :goto_7
    monitor-exit p2

    .line 291
    :goto_8
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 295
    .line 296
    .line 297
    return v1

    .line 298
    :goto_9
    monitor-exit p2

    .line 299
    throw p0
.end method
