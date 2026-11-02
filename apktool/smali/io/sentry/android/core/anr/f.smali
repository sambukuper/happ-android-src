.class public final synthetic Lio/sentry/android/core/anr/f;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lio/sentry/android/core/anr/f;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/android/core/anr/f;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lio/sentry/android/core/anr/f;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-byte v0, p0, Lio/sentry/android/core/anr/f;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/android/core/anr/f;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Ljava/lang/Runnable;

    .line 11
    .line 12
    iget-object p0, p0, Lio/sentry/android/core/anr/f;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lio/sentry/android/replay/util/g;

    .line 15
    .line 16
    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    iget-object p0, p0, Lio/sentry/android/replay/util/g;->Y:Lio/sentry/s6;

    .line 22
    .line 23
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object v2, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 28
    .line 29
    instance-of v3, v1, Lio/sentry/android/replay/util/h;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    check-cast v1, Lio/sentry/android/replay/util/h;

    .line 34
    .line 35
    iget-object v1, v1, Lio/sentry/android/replay/util/h;->X:Ljava/lang/String;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string v1, ""

    .line 39
    .line 40
    :goto_0
    const-string v3, "Failed to execute task "

    .line 41
    .line 42
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {p0, v2, v1, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    return-void

    .line 50
    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/anr/f;->Y:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lio/sentry/android/core/internal/modules/a;

    .line 53
    .line 54
    iget-object p0, p0, Lio/sentry/android/core/anr/f;->Z:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Lio/sentry/s6;

    .line 57
    .line 58
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/android/core/internal/modules/a;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :catchall_1
    move-exception v0

    .line 63
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 68
    .line 69
    const-string v2, "Failed to execute task ReplayIntegration.finalize_previous_replay"

    .line 70
    .line 71
    invoke-interface {p0, v1, v2, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :goto_2
    return-void

    .line 75
    :pswitch_1
    iget-object v0, p0, Lio/sentry/android/core/anr/f;->Y:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Ljava/io/File;

    .line 78
    .line 79
    iget-object p0, p0, Lio/sentry/android/core/anr/f;->Z:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, Lio/sentry/android/replay/capture/f;

    .line 82
    .line 83
    if-nez v0, :cond_1

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    if-eqz v2, :cond_4

    .line 91
    .line 92
    array-length v3, v2

    .line 93
    :goto_3
    if-ge v1, v3, :cond_4

    .line 94
    .line 95
    aget-object v4, v2, v1

    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-nez v5, :cond_2

    .line 102
    .line 103
    invoke-static {v4}, Lda2;->S(Ljava/io/File;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    const-string v6, "mp4"

    .line 108
    .line 109
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-nez v5, :cond_3

    .line 114
    .line 115
    :cond_2
    invoke-static {v4}, Lio/sentry/util/b;->g(Ljava/io/File;)Z

    .line 116
    .line 117
    .line 118
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_4
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 122
    .line 123
    .line 124
    :goto_4
    const/4 v0, -0x1

    .line 125
    invoke-virtual {p0, v0}, Lio/sentry/android/replay/capture/c;->k(I)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_2
    iget-object v0, p0, Lio/sentry/android/core/anr/f;->Y:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Lio/sentry/android/replay/capture/c;

    .line 132
    .line 133
    iget-object p0, p0, Lio/sentry/android/core/anr/f;->Z:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p0, Ljava/util/Date;

    .line 136
    .line 137
    invoke-virtual {v0, p0}, Lio/sentry/android/replay/capture/c;->m(Ljava/util/Date;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :pswitch_3
    iget-object v0, p0, Lio/sentry/android/core/anr/f;->Y:Ljava/lang/Object;

    .line 142
    .line 143
    move-object v2, v0

    .line 144
    check-cast v2, Lio/sentry/android/replay/ReplayIntegration;

    .line 145
    .line 146
    iget-object p0, p0, Lio/sentry/android/core/anr/f;->Z:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast p0, Ljava/util/concurrent/CountDownLatch;

    .line 149
    .line 150
    sget v0, Lio/sentry/android/replay/ReplayIntegration;->r0:I

    .line 151
    .line 152
    :try_start_2
    invoke-virtual {v2}, Lio/sentry/android/replay/ReplayIntegration;->c0()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v1}, Lio/sentry/android/replay/ReplayIntegration;->V0(Z)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :catchall_2
    move-exception v0

    .line 163
    invoke-virtual {v2, v1}, Lio/sentry/android/replay/ReplayIntegration;->V0(Z)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 167
    .line 168
    .line 169
    throw v0

    .line 170
    :pswitch_4
    iget-object v0, p0, Lio/sentry/android/core/anr/f;->Y:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Lio/sentry/android/ndk/b;

    .line 173
    .line 174
    iget-object p0, p0, Lio/sentry/android/core/anr/f;->Z:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, Lio/sentry/g;

    .line 177
    .line 178
    iget-object v2, v0, Lio/sentry/android/ndk/b;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 179
    .line 180
    iget-object v0, p0, Lio/sentry/g;->k0:Lio/sentry/s5;

    .line 181
    .line 182
    const/4 v3, 0x0

    .line 183
    if-eqz v0, :cond_5

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 190
    .line 191
    invoke-virtual {v0, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    move-object v4, v0

    .line 196
    goto :goto_5

    .line 197
    :cond_5
    move-object v4, v3

    .line 198
    :goto_5
    invoke-virtual {p0}, Lio/sentry/g;->c()Ljava/util/Date;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 203
    .line 204
    .line 205
    move-result-wide v5

    .line 206
    invoke-static {v5, v6}, Lio/sentry/vendor/a;->f(J)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    :try_start_3
    invoke-virtual {p0}, Lio/sentry/g;->b()Ljava/util/Map;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-nez v5, :cond_6

    .line 219
    .line 220
    invoke-virtual {v2}, Lio/sentry/s6;->getSerializer()Lio/sentry/o1;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-interface {v5, v0}, Lio/sentry/o1;->d(Ljava/util/Map;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 228
    goto :goto_6

    .line 229
    :catchall_3
    move-exception v0

    .line 230
    goto :goto_7

    .line 231
    :cond_6
    :goto_6
    move-object v9, v3

    .line 232
    goto :goto_8

    .line 233
    :goto_7
    invoke-virtual {v2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    sget-object v5, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 238
    .line 239
    const-string v6, "Breadcrumb data is not serializable."

    .line 240
    .line 241
    new-array v1, v1, [Ljava/lang/Object;

    .line 242
    .line 243
    invoke-interface {v2, v5, v0, v6, v1}, Lio/sentry/ILogger;->d(Lio/sentry/s5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    goto :goto_6

    .line 247
    :goto_8
    iget-object v5, p0, Lio/sentry/g;->f0:Ljava/lang/String;

    .line 248
    .line 249
    iget-object v6, p0, Lio/sentry/g;->i0:Ljava/lang/String;

    .line 250
    .line 251
    iget-object v7, p0, Lio/sentry/g;->g0:Ljava/lang/String;

    .line 252
    .line 253
    invoke-static/range {v4 .. v9}, Lio/sentry/ndk/NativeScope;->nativeAddBreadcrumb(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :pswitch_5
    iget-object v0, p0, Lio/sentry/android/core/anr/f;->Y:Ljava/lang/Object;

    .line 258
    .line 259
    move-object v1, v0

    .line 260
    check-cast v1, Lio/sentry/android/core/internal/util/t;

    .line 261
    .line 262
    iget-object p0, p0, Lio/sentry/android/core/anr/f;->Z:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast p0, Lio/sentry/ILogger;

    .line 265
    .line 266
    :try_start_4
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    iput-object v0, v1, Lio/sentry/android/core/internal/util/t;->m0:Landroid/view/Choreographer;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 271
    .line 272
    goto :goto_9

    .line 273
    :catchall_4
    move-exception v0

    .line 274
    sget-object v2, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 275
    .line 276
    const-string v3, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported."

    .line 277
    .line 278
    invoke-interface {p0, v2, v3, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 279
    .line 280
    .line 281
    :goto_9
    :try_start_5
    const-class v0, Landroid/view/Choreographer;

    .line 282
    .line 283
    const-string v2, "mLastFrameTimeNanos"

    .line 284
    .line 285
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    iput-object v0, v1, Lio/sentry/android/core/internal/util/t;->n0:Ljava/lang/reflect/Field;

    .line 290
    .line 291
    iget-object v0, v1, Lio/sentry/android/core/internal/util/t;->n0:Ljava/lang/reflect/Field;

    .line 292
    .line 293
    const/4 v1, 0x1

    .line 294
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catch Ljava/lang/NoSuchFieldException; {:try_start_5 .. :try_end_5} :catch_0

    .line 295
    .line 296
    .line 297
    goto :goto_a

    .line 298
    :catch_0
    move-exception v0

    .line 299
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 300
    .line 301
    const-string v2, "Unable to get the frame timestamp from the choreographer: "

    .line 302
    .line 303
    invoke-interface {p0, v1, v2, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 304
    .line 305
    .line 306
    :goto_a
    return-void

    .line 307
    :pswitch_6
    iget-object v0, p0, Lio/sentry/android/core/anr/f;->Y:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v0, Lio/sentry/android/core/anr/AnrProfilingIntegration;

    .line 310
    .line 311
    iget-object p0, p0, Lio/sentry/android/core/anr/f;->Z:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast p0, Lio/sentry/android/core/anr/d;

    .line 314
    .line 315
    if-nez p0, :cond_7

    .line 316
    .line 317
    goto :goto_b

    .line 318
    :cond_7
    :try_start_6
    invoke-virtual {p0}, Lio/sentry/android/core/anr/d;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 319
    .line 320
    .line 321
    goto :goto_b

    .line 322
    :catch_1
    iget-object p0, v0, Lio/sentry/android/core/anr/AnrProfilingIntegration;->k0:Lio/sentry/ILogger;

    .line 323
    .line 324
    sget-object v0, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 325
    .line 326
    const-string v2, "Failed to close AnrProfileManager"

    .line 327
    .line 328
    new-array v1, v1, [Ljava/lang/Object;

    .line 329
    .line 330
    invoke-interface {p0, v0, v2, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    :goto_b
    return-void

    .line 334
    nop

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
