.class public Lcom/google/firebase/messaging/FirebaseMessagingService;
.super Lcom/google/firebase/messaging/EnhancedIntentService;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final j0:Ljava/util/ArrayDeque;


# instance fields
.field public i0:Lyq6;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayDeque;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/firebase/messaging/FirebaseMessagingService;->j0:Ljava/util/ArrayDeque;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/firebase/messaging/EnhancedIntentService;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final b(Landroid/content/Intent;)Landroid/content/Intent;
    .locals 0

    .line 1
    invoke-static {}, Lz47;->H()Lz47;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lz47;->g0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroid/content/Intent;

    .line 14
    .line 15
    return-object p0
.end method

.method public final c(Landroid/content/Intent;)V
    .locals 9

    .line 1
    const-string v0, "token"

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "com.google.android.c2dm.intent.RECEIVE"

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_4

    .line 14
    .line 15
    const-string v2, "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v2, "com.google.firebase.messaging.NEW_TOKEN"

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->e(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    const-string p0, "com.google.firebase.messaging.FCM_REGISTERED"

    .line 41
    .line 42
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    const-string p0, "com.google.firebase.messaging.FCM_UNREGISTERED"

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_4
    :goto_0
    const-string v0, "google.product_id"

    .line 69
    .line 70
    const-string v1, "message_id"

    .line 71
    .line 72
    const-string v2, "google.message_id"

    .line 73
    .line 74
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    const/4 v5, 0x3

    .line 83
    const/4 v6, 0x0

    .line 84
    if-eqz v4, :cond_5

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    sget-object v4, Lcom/google/firebase/messaging/FirebaseMessagingService;->j0:Ljava/util/ArrayDeque;

    .line 88
    .line 89
    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->contains(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-eqz v7, :cond_6

    .line 94
    .line 95
    goto/16 :goto_4

    .line 96
    .line 97
    :cond_6
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->size()I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    const/16 v8, 0xa

    .line 102
    .line 103
    if-lt v7, v8, :cond_7

    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    :cond_7
    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    :goto_1
    const-string v3, "message_type"

    .line 112
    .line 113
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    if-nez v3, :cond_8

    .line 118
    .line 119
    const-string v3, "gcm"

    .line 120
    .line 121
    :cond_8
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    const/4 v7, -0x1

    .line 126
    sparse-switch v4, :sswitch_data_0

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :sswitch_0
    const-string v4, "send_event"

    .line 131
    .line 132
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-nez v3, :cond_9

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_9
    move v7, v5

    .line 140
    goto :goto_2

    .line 141
    :sswitch_1
    const-string v4, "send_error"

    .line 142
    .line 143
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-nez v3, :cond_a

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_a
    const/4 v7, 0x2

    .line 151
    goto :goto_2

    .line 152
    :sswitch_2
    const-string v4, "gcm"

    .line 153
    .line 154
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-nez v3, :cond_b

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_b
    const/4 v7, 0x1

    .line 162
    goto :goto_2

    .line 163
    :sswitch_3
    const-string v4, "deleted_messages"

    .line 164
    .line 165
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-nez v3, :cond_c

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_c
    move v7, v6

    .line 173
    :goto_2
    packed-switch v7, :pswitch_data_0

    .line 174
    .line 175
    .line 176
    goto/16 :goto_4

    .line 177
    .line 178
    :pswitch_0
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    goto/16 :goto_4

    .line 182
    .line 183
    :pswitch_1
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    if-nez v3, :cond_d

    .line 188
    .line 189
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    :cond_d
    new-instance v3, Lo17;

    .line 193
    .line 194
    const-string v4, "error"

    .line 195
    .line 196
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-direct {v3, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    if-nez v4, :cond_e

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_e
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 207
    .line 208
    invoke-virtual {v4, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    goto :goto_4

    .line 216
    :pswitch_2
    invoke-static {p1}, Lkm4;->b0(Landroid/content/Intent;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    if-nez v3, :cond_f

    .line 224
    .line 225
    new-instance v3, Landroid/os/Bundle;

    .line 226
    .line 227
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 228
    .line 229
    .line 230
    :cond_f
    const-string v4, "androidx.content.wakelockid"

    .line 231
    .line 232
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v3}, Lq02;->N(Landroid/os/Bundle;)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-eqz v4, :cond_11

    .line 240
    .line 241
    new-instance v4, Lq02;

    .line 242
    .line 243
    invoke-direct {v4, v3}, Lq02;-><init>(Landroid/os/Bundle;)V

    .line 244
    .line 245
    .line 246
    new-instance v7, Le25;

    .line 247
    .line 248
    const-string v8, "Firebase-Messaging-Network-Io"

    .line 249
    .line 250
    invoke-direct {v7, v8}, Le25;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-static {v7}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    new-instance v8, Llr;

    .line 258
    .line 259
    invoke-direct {v8, p0, v4, v7}, Llr;-><init>(Lcom/google/firebase/messaging/FirebaseMessagingService;Lq02;Ljava/util/concurrent/ExecutorService;)V

    .line 260
    .line 261
    .line 262
    :try_start_0
    invoke-virtual {v8}, Llr;->s()Z

    .line 263
    .line 264
    .line 265
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 266
    if-eqz v4, :cond_10

    .line 267
    .line 268
    invoke-interface {v7}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 269
    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_10
    invoke-interface {v7}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 273
    .line 274
    .line 275
    invoke-static {p1}, Lkm4;->m0(Landroid/content/Intent;)Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    if-eqz v4, :cond_11

    .line 280
    .line 281
    const-string v4, "_nf"

    .line 282
    .line 283
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    invoke-static {v4, v7}, Lkm4;->c0(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 288
    .line 289
    .line 290
    goto :goto_3

    .line 291
    :catchall_0
    move-exception p0

    .line 292
    invoke-interface {v7}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 293
    .line 294
    .line 295
    throw p0

    .line 296
    :cond_11
    :goto_3
    new-instance v4, Lhd6;

    .line 297
    .line 298
    invoke-direct {v4, v3}, Lhd6;-><init>(Landroid/os/Bundle;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0, v4}, Lcom/google/firebase/messaging/FirebaseMessagingService;->d(Lhd6;)V

    .line 302
    .line 303
    .line 304
    :goto_4
    :pswitch_3
    iget-object v3, p0, Lcom/google/firebase/messaging/FirebaseMessagingService;->i0:Lyq6;

    .line 305
    .line 306
    if-nez v3, :cond_12

    .line 307
    .line 308
    new-instance v3, Lyq6;

    .line 309
    .line 310
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-direct {v3, v4}, Lyq6;-><init>(Landroid/content/Context;)V

    .line 315
    .line 316
    .line 317
    iput-object v3, p0, Lcom/google/firebase/messaging/FirebaseMessagingService;->i0:Lyq6;

    .line 318
    .line 319
    :cond_12
    iget-object p0, v3, Lyq6;->c:Lcb0;

    .line 320
    .line 321
    invoke-virtual {p0}, Lcb0;->w()I

    .line 322
    .line 323
    .line 324
    move-result p0

    .line 325
    const v4, 0xdedfaa0

    .line 326
    .line 327
    .line 328
    if-lt p0, v4, :cond_16

    .line 329
    .line 330
    new-instance p0, Landroid/os/Bundle;

    .line 331
    .line 332
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    if-nez v4, :cond_13

    .line 340
    .line 341
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    :cond_13
    invoke-virtual {p0, v2, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    if-eqz v1, :cond_14

    .line 353
    .line 354
    invoke-virtual {p1, v0, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 355
    .line 356
    .line 357
    move-result p1

    .line 358
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    goto :goto_5

    .line 363
    :cond_14
    const/4 p1, 0x0

    .line 364
    :goto_5
    if-eqz p1, :cond_15

    .line 365
    .line 366
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 367
    .line 368
    .line 369
    move-result p1

    .line 370
    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 371
    .line 372
    .line 373
    :cond_15
    iget-object p1, v3, Lyq6;->b:Landroid/content/Context;

    .line 374
    .line 375
    invoke-static {p1}, Leb9;->n(Landroid/content/Context;)Leb9;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    new-instance v0, Lbb9;

    .line 380
    .line 381
    monitor-enter p1

    .line 382
    :try_start_1
    iget v1, p1, Leb9;->Y:I

    .line 383
    .line 384
    add-int/lit8 v2, v1, 0x1

    .line 385
    .line 386
    iput v2, p1, Leb9;->Y:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 387
    .line 388
    monitor-exit p1

    .line 389
    invoke-direct {v0, v1, v5, p0, v6}, Lbb9;-><init>(IILandroid/os/Bundle;B)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {p1, v0}, Leb9;->o(Lbb9;)Lfb9;

    .line 393
    .line 394
    .line 395
    return-void

    .line 396
    :catchall_1
    move-exception p0

    .line 397
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 398
    throw p0

    .line 399
    :cond_16
    new-instance p0, Ljava/io/IOException;

    .line 400
    .line 401
    const-string p1, "SERVICE_NOT_AVAILABLE"

    .line 402
    .line 403
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    invoke-static {p0}, Lg28;->k(Ljava/lang/Exception;)Lfb9;

    .line 407
    .line 408
    .line 409
    return-void

    .line 410
    nop

    .line 411
    :sswitch_data_0
    .sparse-switch
        -0x7aedf14e -> :sswitch_3
        0x18f11 -> :sswitch_2
        0x308f3e91 -> :sswitch_1
        0x3090df23 -> :sswitch_0
    .end sparse-switch

    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lhd6;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method
