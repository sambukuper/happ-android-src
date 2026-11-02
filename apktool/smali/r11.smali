.class public final Lr11;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lzf3;


# static fields
.field public static final b:Lr11;


# instance fields
.field public final synthetic a:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr11;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lr11;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lr11;->b:Lr11;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 8
    iput-byte p1, p0, Lr11;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll95;)V
    .locals 0

    .line 1
    const/4 p1, 0x4

    .line 2
    iput-byte p1, p0, Lr11;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static d(Lzf6;I)I
    .locals 1

    .line 1
    const-string v0, "Retry-After"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lzf6;->g(Lzf6;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    const-string p1, "\\d+"

    .line 11
    .line 12
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0

    .line 41
    :cond_1
    const p0, 0x7fffffff

    .line 42
    .line 43
    .line 44
    return p0
.end method


# virtual methods
.method public final a(Ly76;)Lzf6;
    .locals 47

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-byte v0, v1, Lr11;->a:B

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v2, Ly76;->e:Ly5;

    .line 11
    .line 12
    iget-object v7, v2, Ly76;->a:Lm76;

    .line 13
    .line 14
    sget-object v8, Ld02;->X:Ld02;

    .line 15
    .line 16
    move-object v9, v8

    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v11, 0x0

    .line 19
    move-object v8, v0

    .line 20
    :goto_0
    const/4 v0, 0x1

    .line 21
    :goto_1
    iget-object v12, v7, Lm76;->k0:Lwg;

    .line 22
    .line 23
    if-nez v12, :cond_f

    .line 24
    .line 25
    monitor-enter v7

    .line 26
    :try_start_0
    iget-boolean v12, v7, Lm76;->m0:Z

    .line 27
    .line 28
    if-nez v12, :cond_e

    .line 29
    .line 30
    iget-boolean v12, v7, Lm76;->l0:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    .line 32
    if-nez v12, :cond_d

    .line 33
    .line 34
    monitor-exit v7

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    new-instance v0, Lp42;

    .line 38
    .line 39
    iget-object v12, v7, Lm76;->Z:Lry1;

    .line 40
    .line 41
    iget-object v13, v8, Ly5;->Y:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v13, Lu23;

    .line 44
    .line 45
    iget-object v14, v7, Lm76;->X:Ll95;

    .line 46
    .line 47
    iget-boolean v15, v13, Lu23;->i:Z

    .line 48
    .line 49
    if-eqz v15, :cond_1

    .line 50
    .line 51
    iget-object v15, v14, Ll95;->l0:Ljavax/net/ssl/SSLSocketFactory;

    .line 52
    .line 53
    if-eqz v15, :cond_0

    .line 54
    .line 55
    iget-object v4, v14, Ll95;->o0:Ljavax/net/ssl/HostnameVerifier;

    .line 56
    .line 57
    iget-object v3, v14, Ll95;->p0:Lto0;

    .line 58
    .line 59
    move-object/from16 v25, v3

    .line 60
    .line 61
    move-object/from16 v24, v4

    .line 62
    .line 63
    move-object/from16 v23, v15

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_0
    const-string v0, "CLEARTEXT-only client"

    .line 67
    .line 68
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    const/4 v6, 0x0

    .line 72
    goto/16 :goto_a

    .line 73
    .line 74
    :cond_1
    const/16 v23, 0x0

    .line 75
    .line 76
    const/16 v24, 0x0

    .line 77
    .line 78
    const/16 v25, 0x0

    .line 79
    .line 80
    :goto_3
    new-instance v18, Lj7;

    .line 81
    .line 82
    iget-object v3, v13, Lu23;->d:Ljava/lang/String;

    .line 83
    .line 84
    iget v4, v13, Lu23;->e:I

    .line 85
    .line 86
    iget-object v13, v14, Ll95;->h0:Loq1;

    .line 87
    .line 88
    iget-object v15, v14, Ll95;->k0:Ljavax/net/SocketFactory;

    .line 89
    .line 90
    iget-object v5, v14, Ll95;->i0:Ljava/net/Proxy;

    .line 91
    .line 92
    iget-object v6, v14, Ll95;->n0:Ljava/util/List;

    .line 93
    .line 94
    move-object/from16 v19, v3

    .line 95
    .line 96
    iget-object v3, v14, Ll95;->m0:Ljava/util/List;

    .line 97
    .line 98
    iget-object v14, v14, Ll95;->j0:Ljava/net/ProxySelector;

    .line 99
    .line 100
    move-object/from16 v28, v3

    .line 101
    .line 102
    move/from16 v20, v4

    .line 103
    .line 104
    move-object/from16 v26, v5

    .line 105
    .line 106
    move-object/from16 v27, v6

    .line 107
    .line 108
    move-object/from16 v21, v13

    .line 109
    .line 110
    move-object/from16 v29, v14

    .line 111
    .line 112
    move-object/from16 v22, v15

    .line 113
    .line 114
    invoke-direct/range {v18 .. v29}, Lj7;-><init>(Ljava/lang/String;ILoq1;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lto0;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 115
    .line 116
    .line 117
    move-object/from16 v3, v18

    .line 118
    .line 119
    invoke-direct {v0, v12, v3, v7}, Lp42;-><init>(Lry1;Lj7;Lm76;)V

    .line 120
    .line 121
    .line 122
    iput-object v0, v7, Lm76;->i0:Lp42;

    .line 123
    .line 124
    :cond_2
    :try_start_1
    iget-boolean v0, v7, Lm76;->o0:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    .line 126
    if-nez v0, :cond_c

    .line 127
    .line 128
    :try_start_2
    invoke-virtual {v2, v8}, Ly76;->b(Ly5;)Lzf6;

    .line 129
    .line 130
    .line 131
    move-result-object v0
    :try_end_2
    .catch Lnm6; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 132
    if-eqz v10, :cond_3

    .line 133
    .line 134
    :try_start_3
    invoke-virtual {v0}, Lzf6;->k()Lyf6;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v10}, Lzf6;->k()Lyf6;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    const/4 v4, 0x0

    .line 143
    iput-object v4, v3, Lyf6;->g:Lb86;

    .line 144
    .line 145
    invoke-virtual {v3}, Lyf6;->a()Lzf6;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    iget-object v4, v3, Lzf6;->i0:Lb86;

    .line 150
    .line 151
    if-nez v4, :cond_4

    .line 152
    .line 153
    iput-object v3, v0, Lyf6;->j:Lzf6;

    .line 154
    .line 155
    invoke-virtual {v0}, Lyf6;->a()Lzf6;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    :cond_3
    move-object v10, v0

    .line 160
    goto :goto_4

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    const/4 v3, 0x1

    .line 163
    goto/16 :goto_8

    .line 164
    .line 165
    :cond_4
    const-string v0, "priorResponse.body != null"

    .line 166
    .line 167
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 168
    .line 169
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v1

    .line 173
    :goto_4
    iget-object v0, v7, Lm76;->k0:Lwg;

    .line 174
    .line 175
    invoke-virtual {v1, v10, v0}, Lr11;->b(Lzf6;Lwg;)Ly5;

    .line 176
    .line 177
    .line 178
    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 179
    if-nez v8, :cond_5

    .line 180
    .line 181
    const/4 v3, 0x0

    .line 182
    invoke-virtual {v7, v3}, Lm76;->c(Z)V

    .line 183
    .line 184
    .line 185
    move-object v6, v10

    .line 186
    goto/16 :goto_a

    .line 187
    .line 188
    :cond_5
    :try_start_4
    iget-object v0, v10, Lzf6;->i0:Lb86;

    .line 189
    .line 190
    if-eqz v0, :cond_6

    .line 191
    .line 192
    invoke-static {v0}, Lks8;->c(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 193
    .line 194
    .line 195
    :cond_6
    add-int/lit8 v11, v11, 0x1

    .line 196
    .line 197
    const/16 v3, 0x14

    .line 198
    .line 199
    if-gt v11, v3, :cond_7

    .line 200
    .line 201
    const/4 v3, 0x1

    .line 202
    invoke-virtual {v7, v3}, Lm76;->c(Z)V

    .line 203
    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_7
    :try_start_5
    new-instance v0, Ljava/net/ProtocolException;

    .line 208
    .line 209
    new-instance v1, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    const-string v2, "Too many follow-up requests: "

    .line 215
    .line 216
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v0

    .line 230
    :catch_0
    move-exception v0

    .line 231
    instance-of v3, v0, Ly11;

    .line 232
    .line 233
    const/4 v4, 0x1

    .line 234
    xor-int/2addr v3, v4

    .line 235
    invoke-virtual {v1, v0, v7, v8, v3}, Lr11;->c(Ljava/io/IOException;Lm76;Ly5;Z)Z

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    if-eqz v3, :cond_8

    .line 240
    .line 241
    invoke-static {v9, v0}, Lwv0;->I0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 242
    .line 243
    .line 244
    move-result-object v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 245
    invoke-virtual {v7, v4}, Lm76;->c(Z)V

    .line 246
    .line 247
    .line 248
    :goto_5
    const/4 v0, 0x0

    .line 249
    goto/16 :goto_1

    .line 250
    .line 251
    :cond_8
    :try_start_6
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-eqz v2, :cond_9

    .line 260
    .line 261
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    check-cast v2, Ljava/lang/Exception;

    .line 266
    .line 267
    invoke-static {v0, v2}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 268
    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_9
    throw v0

    .line 272
    :catch_1
    move-exception v0

    .line 273
    iget-object v3, v0, Lnm6;->Y:Ljava/io/IOException;

    .line 274
    .line 275
    const/4 v4, 0x0

    .line 276
    invoke-virtual {v1, v3, v7, v8, v4}, Lr11;->c(Ljava/io/IOException;Lm76;Ly5;Z)Z

    .line 277
    .line 278
    .line 279
    move-result v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 280
    iget-object v0, v0, Lnm6;->X:Ljava/io/IOException;

    .line 281
    .line 282
    if-eqz v3, :cond_a

    .line 283
    .line 284
    :try_start_7
    invoke-static {v9, v0}, Lwv0;->I0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 285
    .line 286
    .line 287
    move-result-object v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 288
    const/4 v3, 0x1

    .line 289
    invoke-virtual {v7, v3}, Lm76;->c(Z)V

    .line 290
    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_a
    :try_start_8
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    if-eqz v2, :cond_b

    .line 302
    .line 303
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    check-cast v2, Ljava/lang/Exception;

    .line 308
    .line 309
    invoke-static {v0, v2}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 310
    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_b
    throw v0

    .line 314
    :cond_c
    new-instance v0, Ljava/io/IOException;

    .line 315
    .line 316
    const-string v1, "Canceled"

    .line 317
    .line 318
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 322
    :goto_8
    invoke-virtual {v7, v3}, Lm76;->c(Z)V

    .line 323
    .line 324
    .line 325
    throw v0

    .line 326
    :cond_d
    :try_start_9
    const-string v0, "Check failed."

    .line 327
    .line 328
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 329
    .line 330
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw v1

    .line 334
    :catchall_1
    move-exception v0

    .line 335
    goto :goto_9

    .line 336
    :cond_e
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    .line 337
    .line 338
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 339
    .line 340
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 344
    :goto_9
    monitor-exit v7

    .line 345
    throw v0

    .line 346
    :cond_f
    const-string v0, "Check failed."

    .line 347
    .line 348
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    goto/16 :goto_2

    .line 352
    .line 353
    :goto_a
    return-object v6

    .line 354
    :pswitch_0
    iget-object v0, v2, Ly76;->e:Ly5;

    .line 355
    .line 356
    invoke-virtual {v2, v0}, Ly76;->b(Ly5;)Lzf6;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    const-string v3, "location"

    .line 361
    .line 362
    invoke-static {v1, v3}, Lzf6;->g(Lzf6;Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    if-eqz v3, :cond_10

    .line 367
    .line 368
    const-string v4, "happ://"

    .line 369
    .line 370
    const/4 v5, 0x0

    .line 371
    invoke-static {v3, v5, v4}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    if-eqz v4, :cond_10

    .line 376
    .line 377
    sget-object v4, Lkw2;->a:Lkw2;

    .line 378
    .line 379
    invoke-static {v3}, Lkw2;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    :cond_10
    if-nez v3, :cond_11

    .line 384
    .line 385
    goto :goto_c

    .line 386
    :cond_11
    invoke-virtual {v0}, Ly5;->V()Lz47;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    const-string v1, "ws:"

    .line 391
    .line 392
    const/4 v4, 0x1

    .line 393
    invoke-static {v3, v4, v1}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    if-eqz v1, :cond_12

    .line 398
    .line 399
    const/4 v1, 0x3

    .line 400
    invoke-virtual {v3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    const-string v3, "http:"

    .line 405
    .line 406
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    goto :goto_b

    .line 411
    :cond_12
    const-string v1, "wss:"

    .line 412
    .line 413
    invoke-static {v3, v4, v1}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    if-eqz v1, :cond_13

    .line 418
    .line 419
    const/4 v1, 0x4

    .line 420
    invoke-virtual {v3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    const-string v3, "https:"

    .line 425
    .line 426
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    :cond_13
    :goto_b
    new-instance v1, Lt23;

    .line 431
    .line 432
    const/4 v4, 0x0

    .line 433
    invoke-direct {v1, v4}, Lt23;-><init>(B)V

    .line 434
    .line 435
    .line 436
    const/4 v4, 0x0

    .line 437
    invoke-virtual {v1, v4, v3}, Lt23;->f(Lu23;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v1}, Lt23;->b()Lu23;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    iput-object v1, v0, Lz47;->Z:Ljava/lang/Object;

    .line 445
    .line 446
    invoke-virtual {v0}, Lz47;->o()Ly5;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-virtual {v2, v0}, Ly76;->b(Ly5;)Lzf6;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    :goto_c
    return-object v1

    .line 455
    :pswitch_1
    const-string v1, "Connection"

    .line 456
    .line 457
    const-string v3, "close"

    .line 458
    .line 459
    const-string v4, "HTTP "

    .line 460
    .line 461
    iget-object v5, v2, Ly76;->d:Lwg;

    .line 462
    .line 463
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    iget-object v0, v5, Lwg;->b:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v0, Lm76;

    .line 469
    .line 470
    iget-object v6, v5, Lwg;->d:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v6, Lo42;

    .line 473
    .line 474
    iget-object v7, v5, Lwg;->e:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v7, Lp76;

    .line 477
    .line 478
    iget-object v2, v2, Ly76;->e:Ly5;

    .line 479
    .line 480
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 481
    .line 482
    .line 483
    move-result-wide v8

    .line 484
    :try_start_a
    invoke-interface {v6, v2}, Lo42;->d(Ly5;)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4

    .line 485
    .line 486
    .line 487
    :try_start_b
    iget-object v10, v2, Ly5;->Z:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v10, Ljava/lang/String;

    .line 490
    .line 491
    invoke-static {v10}, Lu15;->I(Ljava/lang/String;)Z

    .line 492
    .line 493
    .line 494
    const/4 v10, 0x1

    .line 495
    const/4 v11, 0x0

    .line 496
    const/4 v12, 0x0

    .line 497
    invoke-virtual {v0, v5, v10, v11, v12}, Lm76;->e(Lwg;ZZLjava/io/IOException;)Ljava/io/IOException;
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3

    .line 498
    .line 499
    .line 500
    :try_start_c
    invoke-interface {v6}, Lo42;->finishRequest()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_2

    .line 501
    .line 502
    .line 503
    const/4 v10, 0x0

    .line 504
    :goto_d
    const/4 v11, 0x0

    .line 505
    goto :goto_f

    .line 506
    :catch_2
    move-exception v0

    .line 507
    :try_start_d
    invoke-virtual {v5, v0}, Lwg;->A(Ljava/io/IOException;)V

    .line 508
    .line 509
    .line 510
    throw v0

    .line 511
    :catch_3
    move-exception v0

    .line 512
    goto :goto_e

    .line 513
    :catch_4
    move-exception v0

    .line 514
    invoke-virtual {v5, v0}, Lwg;->A(Ljava/io/IOException;)V

    .line 515
    .line 516
    .line 517
    throw v0
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_3

    .line 518
    :goto_e
    instance-of v10, v0, Ly11;

    .line 519
    .line 520
    if-nez v10, :cond_1e

    .line 521
    .line 522
    iget-boolean v10, v5, Lwg;->a:Z

    .line 523
    .line 524
    if-eqz v10, :cond_1d

    .line 525
    .line 526
    move-object v10, v0

    .line 527
    goto :goto_d

    .line 528
    :goto_f
    :try_start_e
    invoke-virtual {v5, v11}, Lwg;->w(Z)Lyf6;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    iput-object v2, v0, Lyf6;->a:Ly5;

    .line 536
    .line 537
    iget-object v11, v7, Lp76;->e:Lov2;

    .line 538
    .line 539
    iput-object v11, v0, Lyf6;->e:Lov2;

    .line 540
    .line 541
    iput-wide v8, v0, Lyf6;->k:J

    .line 542
    .line 543
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 544
    .line 545
    .line 546
    move-result-wide v11

    .line 547
    iput-wide v11, v0, Lyf6;->l:J

    .line 548
    .line 549
    invoke-virtual {v0}, Lyf6;->a()Lzf6;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    iget v11, v0, Lzf6;->f0:I

    .line 554
    .line 555
    const/16 v12, 0x64

    .line 556
    .line 557
    if-ne v11, v12, :cond_14

    .line 558
    .line 559
    :goto_10
    const/4 v11, 0x0

    .line 560
    goto :goto_11

    .line 561
    :cond_14
    const/16 v12, 0x66

    .line 562
    .line 563
    if-gt v12, v11, :cond_15

    .line 564
    .line 565
    const/16 v12, 0xc8

    .line 566
    .line 567
    if-ge v11, v12, :cond_15

    .line 568
    .line 569
    goto :goto_10

    .line 570
    :goto_11
    invoke-virtual {v5, v11}, Lwg;->w(Z)Lyf6;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    iput-object v2, v0, Lyf6;->a:Ly5;

    .line 578
    .line 579
    iget-object v2, v7, Lp76;->e:Lov2;

    .line 580
    .line 581
    iput-object v2, v0, Lyf6;->e:Lov2;

    .line 582
    .line 583
    iput-wide v8, v0, Lyf6;->k:J

    .line 584
    .line 585
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 586
    .line 587
    .line 588
    move-result-wide v7

    .line 589
    iput-wide v7, v0, Lyf6;->l:J

    .line 590
    .line 591
    invoke-virtual {v0}, Lyf6;->a()Lzf6;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    iget v11, v0, Lzf6;->f0:I

    .line 596
    .line 597
    goto :goto_12

    .line 598
    :catch_5
    move-exception v0

    .line 599
    goto/16 :goto_15

    .line 600
    .line 601
    :cond_15
    :goto_12
    invoke-virtual {v0}, Lzf6;->k()Lyf6;

    .line 602
    .line 603
    .line 604
    move-result-object v2
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_5

    .line 605
    :try_start_f
    const-string v7, "Content-Type"

    .line 606
    .line 607
    invoke-static {v0, v7}, Lzf6;->g(Lzf6;Ljava/lang/String;)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    invoke-interface {v6, v0}, Lo42;->b(Lzf6;)J

    .line 611
    .line 612
    .line 613
    move-result-wide v7

    .line 614
    invoke-interface {v6, v0}, Lo42;->a(Lzf6;)Lje7;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    new-instance v9, Ln42;

    .line 619
    .line 620
    invoke-direct {v9, v5, v0, v7, v8}, Ln42;-><init>(Lwg;Lje7;J)V

    .line 621
    .line 622
    .line 623
    new-instance v0, Lb86;

    .line 624
    .line 625
    new-instance v12, Lj76;

    .line 626
    .line 627
    invoke-direct {v12, v9}, Lj76;-><init>(Lje7;)V

    .line 628
    .line 629
    .line 630
    const/4 v9, 0x0

    .line 631
    invoke-direct {v0, v7, v8, v12, v9}, Lb86;-><init>(JLba0;B)V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_6

    .line 632
    .line 633
    .line 634
    :try_start_10
    iput-object v0, v2, Lyf6;->g:Lb86;

    .line 635
    .line 636
    invoke-virtual {v2}, Lyf6;->a()Lzf6;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    iget-object v2, v0, Lzf6;->X:Ly5;

    .line 641
    .line 642
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    iget-object v2, v2, Ly5;->g0:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v2, Lnz2;

    .line 648
    .line 649
    invoke-virtual {v2, v1}, Lnz2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 654
    .line 655
    .line 656
    move-result v2

    .line 657
    if-nez v2, :cond_16

    .line 658
    .line 659
    invoke-static {v0, v1}, Lzf6;->g(Lzf6;Ljava/lang/String;)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 664
    .line 665
    .line 666
    move-result v1

    .line 667
    if-eqz v1, :cond_17

    .line 668
    .line 669
    :cond_16
    invoke-interface {v6}, Lo42;->c()Lp76;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    invoke-virtual {v1}, Lp76;->k()V

    .line 674
    .line 675
    .line 676
    :cond_17
    const/16 v1, 0xcc

    .line 677
    .line 678
    if-eq v11, v1, :cond_18

    .line 679
    .line 680
    const/16 v1, 0xcd

    .line 681
    .line 682
    if-ne v11, v1, :cond_1b

    .line 683
    .line 684
    :cond_18
    iget-object v1, v0, Lzf6;->i0:Lb86;

    .line 685
    .line 686
    if-eqz v1, :cond_19

    .line 687
    .line 688
    invoke-virtual {v1}, Lb86;->g()J

    .line 689
    .line 690
    .line 691
    move-result-wide v1

    .line 692
    goto :goto_13

    .line 693
    :cond_19
    const-wide/16 v1, -0x1

    .line 694
    .line 695
    :goto_13
    const-wide/16 v5, 0x0

    .line 696
    .line 697
    cmp-long v1, v1, v5

    .line 698
    .line 699
    if-lez v1, :cond_1b

    .line 700
    .line 701
    new-instance v1, Ljava/net/ProtocolException;

    .line 702
    .line 703
    new-instance v2, Ljava/lang/StringBuilder;

    .line 704
    .line 705
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    const-string v3, " had non-zero Content-Length: "

    .line 712
    .line 713
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    iget-object v0, v0, Lzf6;->i0:Lb86;

    .line 717
    .line 718
    if-eqz v0, :cond_1a

    .line 719
    .line 720
    invoke-virtual {v0}, Lb86;->g()J

    .line 721
    .line 722
    .line 723
    move-result-wide v3

    .line 724
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 725
    .line 726
    .line 727
    move-result-object v6

    .line 728
    goto :goto_14

    .line 729
    :cond_1a
    const/4 v6, 0x0

    .line 730
    :goto_14
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    throw v1

    .line 741
    :cond_1b
    return-object v0

    .line 742
    :catch_6
    move-exception v0

    .line 743
    invoke-virtual {v5, v0}, Lwg;->A(Ljava/io/IOException;)V

    .line 744
    .line 745
    .line 746
    throw v0
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_5

    .line 747
    :goto_15
    if-eqz v10, :cond_1c

    .line 748
    .line 749
    invoke-static {v10, v0}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 750
    .line 751
    .line 752
    throw v10

    .line 753
    :cond_1c
    throw v0

    .line 754
    :cond_1d
    throw v0

    .line 755
    :cond_1e
    throw v0

    .line 756
    :pswitch_2
    const-string v0, "networkResponse"

    .line 757
    .line 758
    const-string v1, "Content-Type"

    .line 759
    .line 760
    const-string v3, "Content-Encoding"

    .line 761
    .line 762
    const-string v4, "Content-Length"

    .line 763
    .line 764
    const-string v5, "cacheResponse"

    .line 765
    .line 766
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 767
    .line 768
    .line 769
    iget-object v6, v2, Ly76;->e:Ly5;

    .line 770
    .line 771
    new-instance v7, Ldq;

    .line 772
    .line 773
    const/16 v8, 0x18

    .line 774
    .line 775
    const/4 v12, 0x0

    .line 776
    invoke-direct {v7, v6, v12, v8}, Ldq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 777
    .line 778
    .line 779
    iget-object v9, v6, Ly5;->h0:Ljava/lang/Object;

    .line 780
    .line 781
    check-cast v9, Lhc0;

    .line 782
    .line 783
    if-nez v9, :cond_1f

    .line 784
    .line 785
    sget v9, Lhc0;->n:I

    .line 786
    .line 787
    iget-object v9, v6, Ly5;->g0:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v9, Lnz2;

    .line 790
    .line 791
    invoke-static {v9}, Ljm4;->T(Lnz2;)Lhc0;

    .line 792
    .line 793
    .line 794
    move-result-object v9

    .line 795
    iput-object v9, v6, Ly5;->h0:Ljava/lang/Object;

    .line 796
    .line 797
    :cond_1f
    iget-boolean v9, v9, Lhc0;->j:Z

    .line 798
    .line 799
    if-eqz v9, :cond_20

    .line 800
    .line 801
    new-instance v7, Ldq;

    .line 802
    .line 803
    const/4 v12, 0x0

    .line 804
    invoke-direct {v7, v12, v12, v8}, Ldq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 805
    .line 806
    .line 807
    :cond_20
    iget-object v8, v7, Ldq;->Y:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v8, Ly5;

    .line 810
    .line 811
    iget-object v7, v7, Ldq;->Z:Ljava/lang/Object;

    .line 812
    .line 813
    check-cast v7, Lzf6;

    .line 814
    .line 815
    if-nez v8, :cond_21

    .line 816
    .line 817
    if-nez v7, :cond_21

    .line 818
    .line 819
    new-instance v0, Ljava/util/ArrayList;

    .line 820
    .line 821
    const/16 v3, 0x14

    .line 822
    .line 823
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 824
    .line 825
    .line 826
    sget-object v33, Lp06;->Z:Lp06;

    .line 827
    .line 828
    const-string v34, "Unsatisfiable Request (only-if-cached)"

    .line 829
    .line 830
    sget-object v38, Lks8;->c:Lb86;

    .line 831
    .line 832
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 833
    .line 834
    .line 835
    move-result-wide v44

    .line 836
    new-instance v1, Lnz2;

    .line 837
    .line 838
    const/4 v11, 0x0

    .line 839
    new-array v2, v11, [Ljava/lang/String;

    .line 840
    .line 841
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    check-cast v0, [Ljava/lang/String;

    .line 846
    .line 847
    invoke-direct {v1, v0}, Lnz2;-><init>([Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    new-instance v31, Lzf6;

    .line 851
    .line 852
    const/16 v35, 0x1f8

    .line 853
    .line 854
    const/16 v36, 0x0

    .line 855
    .line 856
    const/16 v39, 0x0

    .line 857
    .line 858
    const/16 v40, 0x0

    .line 859
    .line 860
    const/16 v41, 0x0

    .line 861
    .line 862
    const-wide/16 v42, -0x1

    .line 863
    .line 864
    const/16 v46, 0x0

    .line 865
    .line 866
    move-object/from16 v37, v1

    .line 867
    .line 868
    move-object/from16 v32, v6

    .line 869
    .line 870
    invoke-direct/range {v31 .. v46}, Lzf6;-><init>(Ly5;Lp06;Ljava/lang/String;ILov2;Lnz2;Lb86;Lzf6;Lzf6;Lzf6;JJLwg;)V

    .line 871
    .line 872
    .line 873
    goto/16 :goto_1b

    .line 874
    .line 875
    :cond_21
    if-nez v8, :cond_22

    .line 876
    .line 877
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 878
    .line 879
    .line 880
    invoke-virtual {v7}, Lzf6;->k()Lyf6;

    .line 881
    .line 882
    .line 883
    move-result-object v0

    .line 884
    invoke-static {v7}, Lkm4;->n0(Lzf6;)Lzf6;

    .line 885
    .line 886
    .line 887
    move-result-object v1

    .line 888
    invoke-static {v1, v5}, Lyf6;->b(Lzf6;Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    iput-object v1, v0, Lyf6;->i:Lzf6;

    .line 892
    .line 893
    invoke-virtual {v0}, Lyf6;->a()Lzf6;

    .line 894
    .line 895
    .line 896
    move-result-object v31

    .line 897
    goto/16 :goto_1b

    .line 898
    .line 899
    :cond_22
    invoke-virtual {v2, v8}, Ly76;->b(Ly5;)Lzf6;

    .line 900
    .line 901
    .line 902
    move-result-object v2

    .line 903
    if-eqz v7, :cond_2d

    .line 904
    .line 905
    iget v6, v2, Lzf6;->f0:I

    .line 906
    .line 907
    const/16 v8, 0x130

    .line 908
    .line 909
    if-ne v6, v8, :cond_2c

    .line 910
    .line 911
    invoke-virtual {v7}, Lzf6;->k()Lyf6;

    .line 912
    .line 913
    .line 914
    move-result-object v6

    .line 915
    iget-object v8, v7, Lzf6;->h0:Lnz2;

    .line 916
    .line 917
    iget-object v9, v2, Lzf6;->h0:Lnz2;

    .line 918
    .line 919
    new-instance v10, Ljava/util/ArrayList;

    .line 920
    .line 921
    const/16 v11, 0x14

    .line 922
    .line 923
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v8}, Lnz2;->size()I

    .line 927
    .line 928
    .line 929
    move-result v11

    .line 930
    const/4 v12, 0x0

    .line 931
    :goto_16
    if-ge v12, v11, :cond_28

    .line 932
    .line 933
    invoke-virtual {v8, v12}, Lnz2;->b(I)Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v13

    .line 937
    invoke-virtual {v8, v12}, Lnz2;->e(I)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v14

    .line 941
    const-string v15, "Warning"

    .line 942
    .line 943
    invoke-virtual {v15, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 944
    .line 945
    .line 946
    move-result v15

    .line 947
    if-eqz v15, :cond_23

    .line 948
    .line 949
    const-string v15, "1"

    .line 950
    .line 951
    move-object/from16 v17, v8

    .line 952
    .line 953
    const/4 v8, 0x0

    .line 954
    invoke-static {v14, v8, v15}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 955
    .line 956
    .line 957
    move-result v15

    .line 958
    if-eqz v15, :cond_24

    .line 959
    .line 960
    goto :goto_18

    .line 961
    :cond_23
    move-object/from16 v17, v8

    .line 962
    .line 963
    :cond_24
    invoke-virtual {v4, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 964
    .line 965
    .line 966
    move-result v8

    .line 967
    if-nez v8, :cond_26

    .line 968
    .line 969
    invoke-virtual {v3, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 970
    .line 971
    .line 972
    move-result v8

    .line 973
    if-nez v8, :cond_26

    .line 974
    .line 975
    invoke-virtual {v1, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 976
    .line 977
    .line 978
    move-result v8

    .line 979
    if-eqz v8, :cond_25

    .line 980
    .line 981
    goto :goto_17

    .line 982
    :cond_25
    invoke-static {v13}, Lkm4;->P(Ljava/lang/String;)Z

    .line 983
    .line 984
    .line 985
    move-result v8

    .line 986
    if-eqz v8, :cond_26

    .line 987
    .line 988
    invoke-virtual {v9, v13}, Lnz2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v8

    .line 992
    if-nez v8, :cond_27

    .line 993
    .line 994
    :cond_26
    :goto_17
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 995
    .line 996
    .line 997
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1001
    .line 1002
    .line 1003
    invoke-static {v14}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v8

    .line 1007
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v8

    .line 1011
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1012
    .line 1013
    .line 1014
    :cond_27
    :goto_18
    add-int/lit8 v12, v12, 0x1

    .line 1015
    .line 1016
    move-object/from16 v8, v17

    .line 1017
    .line 1018
    goto :goto_16

    .line 1019
    :cond_28
    invoke-virtual {v9}, Lnz2;->size()I

    .line 1020
    .line 1021
    .line 1022
    move-result v8

    .line 1023
    const/4 v11, 0x0

    .line 1024
    :goto_19
    if-ge v11, v8, :cond_2b

    .line 1025
    .line 1026
    invoke-virtual {v9, v11}, Lnz2;->b(I)Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v12

    .line 1030
    invoke-virtual {v4, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1031
    .line 1032
    .line 1033
    move-result v13

    .line 1034
    if-nez v13, :cond_2a

    .line 1035
    .line 1036
    invoke-virtual {v3, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v13

    .line 1040
    if-nez v13, :cond_2a

    .line 1041
    .line 1042
    invoke-virtual {v1, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1043
    .line 1044
    .line 1045
    move-result v13

    .line 1046
    if-eqz v13, :cond_29

    .line 1047
    .line 1048
    goto :goto_1a

    .line 1049
    :cond_29
    invoke-static {v12}, Lkm4;->P(Ljava/lang/String;)Z

    .line 1050
    .line 1051
    .line 1052
    move-result v13

    .line 1053
    if-eqz v13, :cond_2a

    .line 1054
    .line 1055
    invoke-virtual {v9, v11}, Lnz2;->e(I)Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v13

    .line 1059
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1066
    .line 1067
    .line 1068
    invoke-static {v13}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v12

    .line 1072
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v12

    .line 1076
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1077
    .line 1078
    .line 1079
    :cond_2a
    :goto_1a
    add-int/lit8 v11, v11, 0x1

    .line 1080
    .line 1081
    goto :goto_19

    .line 1082
    :cond_2b
    const/4 v11, 0x0

    .line 1083
    new-array v1, v11, [Ljava/lang/String;

    .line 1084
    .line 1085
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    check-cast v1, [Ljava/lang/String;

    .line 1090
    .line 1091
    new-instance v3, Lps;

    .line 1092
    .line 1093
    const/4 v4, 0x1

    .line 1094
    invoke-direct {v3, v4}, Lps;-><init>(B)V

    .line 1095
    .line 1096
    .line 1097
    iget-object v4, v3, Lps;->b:Ljava/util/ArrayList;

    .line 1098
    .line 1099
    invoke-static {v4, v1}, Lbw0;->e0(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 1100
    .line 1101
    .line 1102
    iput-object v3, v6, Lyf6;->f:Lps;

    .line 1103
    .line 1104
    iget-wide v3, v2, Lzf6;->m0:J

    .line 1105
    .line 1106
    iput-wide v3, v6, Lyf6;->k:J

    .line 1107
    .line 1108
    iget-wide v3, v2, Lzf6;->n0:J

    .line 1109
    .line 1110
    iput-wide v3, v6, Lyf6;->l:J

    .line 1111
    .line 1112
    invoke-static {v7}, Lkm4;->n0(Lzf6;)Lzf6;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v1

    .line 1116
    invoke-static {v1, v5}, Lyf6;->b(Lzf6;Ljava/lang/String;)V

    .line 1117
    .line 1118
    .line 1119
    iput-object v1, v6, Lyf6;->i:Lzf6;

    .line 1120
    .line 1121
    invoke-static {v2}, Lkm4;->n0(Lzf6;)Lzf6;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v1

    .line 1125
    invoke-static {v1, v0}, Lyf6;->b(Lzf6;Ljava/lang/String;)V

    .line 1126
    .line 1127
    .line 1128
    iput-object v1, v6, Lyf6;->h:Lzf6;

    .line 1129
    .line 1130
    invoke-virtual {v6}, Lyf6;->a()Lzf6;

    .line 1131
    .line 1132
    .line 1133
    iget-object v0, v2, Lzf6;->i0:Lb86;

    .line 1134
    .line 1135
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v0}, Lb86;->close()V

    .line 1139
    .line 1140
    .line 1141
    const/16 v30, 0x0

    .line 1142
    .line 1143
    throw v30

    .line 1144
    :cond_2c
    iget-object v1, v7, Lzf6;->i0:Lb86;

    .line 1145
    .line 1146
    if-eqz v1, :cond_2d

    .line 1147
    .line 1148
    invoke-static {v1}, Lks8;->c(Ljava/io/Closeable;)V

    .line 1149
    .line 1150
    .line 1151
    :cond_2d
    invoke-virtual {v2}, Lzf6;->k()Lyf6;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v1

    .line 1155
    invoke-static {v7}, Lkm4;->n0(Lzf6;)Lzf6;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v3

    .line 1159
    invoke-static {v3, v5}, Lyf6;->b(Lzf6;Ljava/lang/String;)V

    .line 1160
    .line 1161
    .line 1162
    iput-object v3, v1, Lyf6;->i:Lzf6;

    .line 1163
    .line 1164
    invoke-static {v2}, Lkm4;->n0(Lzf6;)Lzf6;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v2

    .line 1168
    invoke-static {v2, v0}, Lyf6;->b(Lzf6;Ljava/lang/String;)V

    .line 1169
    .line 1170
    .line 1171
    iput-object v2, v1, Lyf6;->h:Lzf6;

    .line 1172
    .line 1173
    invoke-virtual {v1}, Lyf6;->a()Lzf6;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v31

    .line 1177
    :goto_1b
    return-object v31

    .line 1178
    :pswitch_3
    iget-object v1, v2, Ly76;->a:Lm76;

    .line 1179
    .line 1180
    monitor-enter v1

    .line 1181
    :try_start_11
    iget-boolean v0, v1, Lm76;->n0:Z

    .line 1182
    .line 1183
    if-eqz v0, :cond_31

    .line 1184
    .line 1185
    iget-boolean v0, v1, Lm76;->m0:Z

    .line 1186
    .line 1187
    if-nez v0, :cond_30

    .line 1188
    .line 1189
    iget-boolean v0, v1, Lm76;->l0:Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 1190
    .line 1191
    if-nez v0, :cond_2f

    .line 1192
    .line 1193
    monitor-exit v1

    .line 1194
    iget-object v3, v1, Lm76;->i0:Lp42;

    .line 1195
    .line 1196
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1197
    .line 1198
    .line 1199
    iget-object v0, v1, Lm76;->X:Ll95;

    .line 1200
    .line 1201
    :try_start_12
    iget v4, v2, Ly76;->f:I

    .line 1202
    .line 1203
    iget v5, v2, Ly76;->g:I

    .line 1204
    .line 1205
    iget v6, v2, Ly76;->h:I

    .line 1206
    .line 1207
    iget-object v7, v2, Ly76;->e:Ly5;

    .line 1208
    .line 1209
    iget-object v7, v7, Ly5;->Z:Ljava/lang/Object;

    .line 1210
    .line 1211
    check-cast v7, Ljava/lang/String;

    .line 1212
    .line 1213
    const-string v8, "GET"

    .line 1214
    .line 1215
    invoke-static {v7, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1216
    .line 1217
    .line 1218
    move-result v7

    .line 1219
    const/16 v16, 0x1

    .line 1220
    .line 1221
    xor-int/lit8 v7, v7, 0x1

    .line 1222
    .line 1223
    invoke-virtual {v3, v4, v5, v6, v7}, Lp42;->a(IIIZ)Lp76;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v4

    .line 1227
    invoke-virtual {v4, v0, v2}, Lp76;->j(Ll95;Ly76;)Lo42;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v0
    :try_end_12
    .catch Lnm6; {:try_start_12 .. :try_end_12} :catch_8
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_7

    .line 1231
    new-instance v4, Lwg;

    .line 1232
    .line 1233
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1234
    .line 1235
    .line 1236
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 1237
    .line 1238
    .line 1239
    iput-object v1, v4, Lwg;->b:Ljava/lang/Object;

    .line 1240
    .line 1241
    iput-object v3, v4, Lwg;->c:Ljava/lang/Object;

    .line 1242
    .line 1243
    iput-object v0, v4, Lwg;->d:Ljava/lang/Object;

    .line 1244
    .line 1245
    invoke-interface {v0}, Lo42;->c()Lp76;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    iput-object v0, v4, Lwg;->e:Ljava/lang/Object;

    .line 1250
    .line 1251
    iput-object v4, v1, Lm76;->k0:Lwg;

    .line 1252
    .line 1253
    iput-object v4, v1, Lm76;->p0:Lwg;

    .line 1254
    .line 1255
    monitor-enter v1

    .line 1256
    const/4 v3, 0x1

    .line 1257
    :try_start_13
    iput-boolean v3, v1, Lm76;->l0:Z

    .line 1258
    .line 1259
    iput-boolean v3, v1, Lm76;->m0:Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    .line 1260
    .line 1261
    monitor-exit v1

    .line 1262
    iget-boolean v0, v1, Lm76;->o0:Z

    .line 1263
    .line 1264
    if-nez v0, :cond_2e

    .line 1265
    .line 1266
    const/16 v0, 0x3d

    .line 1267
    .line 1268
    const/4 v11, 0x0

    .line 1269
    const/4 v12, 0x0

    .line 1270
    invoke-static {v2, v11, v4, v12, v0}, Ly76;->a(Ly76;ILwg;Ly5;I)Ly76;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v0

    .line 1274
    iget-object v1, v2, Ly76;->e:Ly5;

    .line 1275
    .line 1276
    invoke-virtual {v0, v1}, Ly76;->b(Ly5;)Lzf6;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v6

    .line 1280
    goto :goto_1c

    .line 1281
    :cond_2e
    const/4 v12, 0x0

    .line 1282
    const-string v0, "Canceled"

    .line 1283
    .line 1284
    invoke-static {v0}, Lu52;->s(Ljava/lang/String;)V

    .line 1285
    .line 1286
    .line 1287
    move-object v6, v12

    .line 1288
    :goto_1c
    return-object v6

    .line 1289
    :catchall_2
    move-exception v0

    .line 1290
    monitor-exit v1

    .line 1291
    throw v0

    .line 1292
    :catch_7
    move-exception v0

    .line 1293
    goto :goto_1d

    .line 1294
    :catch_8
    move-exception v0

    .line 1295
    goto :goto_1e

    .line 1296
    :goto_1d
    invoke-virtual {v3, v0}, Lp42;->b(Ljava/io/IOException;)V

    .line 1297
    .line 1298
    .line 1299
    new-instance v1, Lnm6;

    .line 1300
    .line 1301
    invoke-direct {v1, v0}, Lnm6;-><init>(Ljava/io/IOException;)V

    .line 1302
    .line 1303
    .line 1304
    throw v1

    .line 1305
    :goto_1e
    iget-object v1, v0, Lnm6;->Y:Ljava/io/IOException;

    .line 1306
    .line 1307
    invoke-virtual {v3, v1}, Lp42;->b(Ljava/io/IOException;)V

    .line 1308
    .line 1309
    .line 1310
    throw v0

    .line 1311
    :cond_2f
    :try_start_14
    const-string v0, "Check failed."

    .line 1312
    .line 1313
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 1314
    .line 1315
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1316
    .line 1317
    .line 1318
    throw v2

    .line 1319
    :catchall_3
    move-exception v0

    .line 1320
    goto :goto_1f

    .line 1321
    :cond_30
    const-string v0, "Check failed."

    .line 1322
    .line 1323
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 1324
    .line 1325
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1326
    .line 1327
    .line 1328
    throw v2

    .line 1329
    :cond_31
    const-string v0, "released"

    .line 1330
    .line 1331
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 1332
    .line 1333
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1334
    .line 1335
    .line 1336
    throw v2
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    .line 1337
    :goto_1f
    monitor-exit v1

    .line 1338
    throw v0

    .line 1339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lzf6;Lwg;)Ly5;
    .locals 9

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    iget-object v0, p2, Lwg;->e:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lp76;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lp76;->b:Lmm6;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, p0

    .line 14
    :goto_0
    iget v1, p1, Lzf6;->f0:I

    .line 15
    .line 16
    iget-object v2, p1, Lzf6;->X:Ly5;

    .line 17
    .line 18
    iget-object v2, v2, Ly5;->Z:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ljava/lang/String;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x1

    .line 24
    const/16 v5, 0x134

    .line 25
    .line 26
    const/16 v6, 0x133

    .line 27
    .line 28
    if-eq v1, v6, :cond_b

    .line 29
    .line 30
    if-eq v1, v5, :cond_b

    .line 31
    .line 32
    const/16 v7, 0x191

    .line 33
    .line 34
    if-eq v1, v7, :cond_a

    .line 35
    .line 36
    const/16 v7, 0x1a5

    .line 37
    .line 38
    if-eq v1, v7, :cond_8

    .line 39
    .line 40
    const/16 p2, 0x1f7

    .line 41
    .line 42
    if-eq v1, p2, :cond_6

    .line 43
    .line 44
    const/16 p2, 0x197

    .line 45
    .line 46
    if-eq v1, p2, :cond_4

    .line 47
    .line 48
    const/16 p2, 0x198

    .line 49
    .line 50
    if-eq v1, p2, :cond_1

    .line 51
    .line 52
    packed-switch v1, :pswitch_data_0

    .line 53
    .line 54
    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :cond_1
    iget-object v0, p1, Lzf6;->l0:Lzf6;

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    iget v0, v0, Lzf6;->f0:I

    .line 62
    .line 63
    if-ne v0, p2, :cond_2

    .line 64
    .line 65
    goto/16 :goto_3

    .line 66
    .line 67
    :cond_2
    invoke-static {p1, v3}, Lr11;->d(Lzf6;I)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-lez p2, :cond_3

    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_3
    iget-object p0, p1, Lzf6;->X:Ly5;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object p1, v0, Lmm6;->b:Ljava/net/Proxy;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 88
    .line 89
    if-ne p1, p2, :cond_5

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_5
    const-string p1, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 93
    .line 94
    invoke-static {p1}, Lxw3;->k(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_6
    iget-object v0, p1, Lzf6;->l0:Lzf6;

    .line 99
    .line 100
    if-eqz v0, :cond_7

    .line 101
    .line 102
    iget v0, v0, Lzf6;->f0:I

    .line 103
    .line 104
    if-ne v0, p2, :cond_7

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_7
    const p2, 0x7fffffff

    .line 108
    .line 109
    .line 110
    invoke-static {p1, p2}, Lr11;->d(Lzf6;I)I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-nez p2, :cond_e

    .line 115
    .line 116
    iget-object p0, p1, Lzf6;->X:Ly5;

    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_8
    if-eqz p2, :cond_e

    .line 120
    .line 121
    iget-object v0, p2, Lwg;->c:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, Lp42;

    .line 124
    .line 125
    iget-object v0, v0, Lp42;->b:Lj7;

    .line 126
    .line 127
    iget-object v0, v0, Lj7;->h:Lu23;

    .line 128
    .line 129
    iget-object v0, v0, Lu23;->d:Ljava/lang/String;

    .line 130
    .line 131
    iget-object v1, p2, Lwg;->e:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, Lp76;

    .line 134
    .line 135
    iget-object v1, v1, Lp76;->b:Lmm6;

    .line 136
    .line 137
    iget-object v1, v1, Lmm6;->a:Lj7;

    .line 138
    .line 139
    iget-object v1, v1, Lj7;->h:Lu23;

    .line 140
    .line 141
    iget-object v1, v1, Lu23;->d:Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_9

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_9
    iget-object p0, p2, Lwg;->e:Ljava/lang/Object;

    .line 151
    .line 152
    move-object p2, p0

    .line 153
    check-cast p2, Lp76;

    .line 154
    .line 155
    monitor-enter p2

    .line 156
    :try_start_0
    iput-boolean v4, p2, Lp76;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    monitor-exit p2

    .line 159
    iget-object p0, p1, Lzf6;->X:Ly5;

    .line 160
    .line 161
    return-object p0

    .line 162
    :catchall_0
    move-exception p0

    .line 163
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    throw p0

    .line 165
    :cond_a
    return-object p0

    .line 166
    :cond_b
    :pswitch_0
    const-string p2, "PROPFIND"

    .line 167
    .line 168
    const-string v0, "Location"

    .line 169
    .line 170
    invoke-static {p1, v0}, Lzf6;->g(Lzf6;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object v1, p1, Lzf6;->X:Ly5;

    .line 175
    .line 176
    if-nez v0, :cond_c

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_c
    iget-object v7, v1, Ly5;->Y:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v7, Lu23;

    .line 182
    .line 183
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    :try_start_2
    new-instance v8, Lt23;

    .line 187
    .line 188
    invoke-direct {v8, v3}, Lt23;-><init>(B)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v8, v7, v0}, Lt23;->f(Lu23;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :catch_0
    move-object v8, p0

    .line 196
    :goto_1
    if-eqz v8, :cond_d

    .line 197
    .line 198
    invoke-virtual {v8}, Lt23;->b()Lu23;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    goto :goto_2

    .line 203
    :cond_d
    move-object v0, p0

    .line 204
    :goto_2
    if-nez v0, :cond_f

    .line 205
    .line 206
    :cond_e
    :goto_3
    return-object p0

    .line 207
    :cond_f
    iget-object v7, v0, Lu23;->a:Ljava/lang/String;

    .line 208
    .line 209
    iget-object v8, v1, Ly5;->Y:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v8, Lu23;

    .line 212
    .line 213
    iget-object v8, v8, Lu23;->a:Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v7, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Ly5;->V()Lz47;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    invoke-static {v2}, Lu15;->I(Ljava/lang/String;)Z

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    if-eqz v8, :cond_13

    .line 227
    .line 228
    iget p1, p1, Lzf6;->f0:I

    .line 229
    .line 230
    invoke-virtual {v2, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v8

    .line 234
    if-nez v8, :cond_10

    .line 235
    .line 236
    if-eq p1, v5, :cond_10

    .line 237
    .line 238
    if-ne p1, v6, :cond_11

    .line 239
    .line 240
    :cond_10
    move v3, v4

    .line 241
    :cond_11
    invoke-virtual {v2, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result p2

    .line 245
    if-nez p2, :cond_12

    .line 246
    .line 247
    if-eq p1, v5, :cond_12

    .line 248
    .line 249
    if-eq p1, v6, :cond_12

    .line 250
    .line 251
    const-string p1, "GET"

    .line 252
    .line 253
    invoke-virtual {v7, p1, p0}, Lz47;->P(Ljava/lang/String;Lw45;)V

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_12
    invoke-virtual {v7, v2, p0}, Lz47;->P(Ljava/lang/String;Lw45;)V

    .line 258
    .line 259
    .line 260
    :goto_4
    if-nez v3, :cond_13

    .line 261
    .line 262
    const-string p0, "Transfer-Encoding"

    .line 263
    .line 264
    iget-object p1, v7, Lz47;->f0:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast p1, Lps;

    .line 267
    .line 268
    invoke-virtual {p1, p0}, Lps;->e(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    const-string p0, "Content-Length"

    .line 272
    .line 273
    iget-object p1, v7, Lz47;->f0:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast p1, Lps;

    .line 276
    .line 277
    invoke-virtual {p1, p0}, Lps;->e(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    const-string p0, "Content-Type"

    .line 281
    .line 282
    iget-object p1, v7, Lz47;->f0:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast p1, Lps;

    .line 285
    .line 286
    invoke-virtual {p1, p0}, Lps;->e(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    :cond_13
    iget-object p0, v1, Ly5;->Y:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast p0, Lu23;

    .line 292
    .line 293
    invoke-static {p0, v0}, Lks8;->a(Lu23;Lu23;)Z

    .line 294
    .line 295
    .line 296
    move-result p0

    .line 297
    if-nez p0, :cond_14

    .line 298
    .line 299
    const-string p0, "Authorization"

    .line 300
    .line 301
    iget-object p1, v7, Lz47;->f0:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast p1, Lps;

    .line 304
    .line 305
    invoke-virtual {p1, p0}, Lps;->e(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    :cond_14
    iput-object v0, v7, Lz47;->Z:Ljava/lang/Object;

    .line 309
    .line 310
    invoke-virtual {v7}, Lz47;->o()Ly5;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    return-object p0

    .line 315
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/io/IOException;Lm76;Ly5;Z)Z
    .locals 2

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p4, :cond_0

    .line 3
    .line 4
    instance-of p3, p1, Ljava/io/FileNotFoundException;

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    goto/16 :goto_5

    .line 9
    .line 10
    :cond_0
    instance-of p3, p1, Ljava/net/ProtocolException;

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    goto/16 :goto_5

    .line 15
    .line 16
    :cond_1
    instance-of p3, p1, Ljava/io/InterruptedIOException;

    .line 17
    .line 18
    if-eqz p3, :cond_2

    .line 19
    .line 20
    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    .line 21
    .line 22
    if-eqz p1, :cond_f

    .line 23
    .line 24
    if-nez p4, :cond_f

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    .line 28
    .line 29
    if-eqz p3, :cond_3

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    instance-of p3, p3, Ljava/security/cert/CertificateException;

    .line 36
    .line 37
    if-eqz p3, :cond_3

    .line 38
    .line 39
    goto/16 :goto_5

    .line 40
    .line 41
    :cond_3
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 42
    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_4
    :goto_0
    iget-object p1, p2, Lm76;->i0:Lp42;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget p2, p1, Lp42;->f:I

    .line 53
    .line 54
    const/4 p3, 0x1

    .line 55
    if-nez p2, :cond_5

    .line 56
    .line 57
    iget p4, p1, Lp42;->g:I

    .line 58
    .line 59
    if-nez p4, :cond_5

    .line 60
    .line 61
    iget p4, p1, Lp42;->h:I

    .line 62
    .line 63
    if-nez p4, :cond_5

    .line 64
    .line 65
    move p1, p0

    .line 66
    goto :goto_4

    .line 67
    :cond_5
    iget-object p4, p1, Lp42;->i:Lmm6;

    .line 68
    .line 69
    if-eqz p4, :cond_6

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_6
    const/4 p4, 0x0

    .line 73
    if-gt p2, p3, :cond_b

    .line 74
    .line 75
    iget p2, p1, Lp42;->g:I

    .line 76
    .line 77
    if-gt p2, p3, :cond_b

    .line 78
    .line 79
    iget p2, p1, Lp42;->h:I

    .line 80
    .line 81
    if-lez p2, :cond_7

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_7
    iget-object p2, p1, Lp42;->c:Lm76;

    .line 85
    .line 86
    iget-object p2, p2, Lm76;->j0:Lp76;

    .line 87
    .line 88
    if-nez p2, :cond_8

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_8
    monitor-enter p2

    .line 92
    :try_start_0
    iget v0, p2, Lp76;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    if-eqz v0, :cond_9

    .line 95
    .line 96
    monitor-exit p2

    .line 97
    goto :goto_1

    .line 98
    :cond_9
    :try_start_1
    iget-object v0, p2, Lp76;->b:Lmm6;

    .line 99
    .line 100
    iget-object v0, v0, Lmm6;->a:Lj7;

    .line 101
    .line 102
    iget-object v0, v0, Lj7;->h:Lu23;

    .line 103
    .line 104
    iget-object v1, p1, Lp42;->b:Lj7;

    .line 105
    .line 106
    iget-object v1, v1, Lj7;->h:Lu23;

    .line 107
    .line 108
    invoke-static {v0, v1}, Lks8;->a(Lu23;Lu23;)Z

    .line 109
    .line 110
    .line 111
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    if-nez v0, :cond_a

    .line 113
    .line 114
    monitor-exit p2

    .line 115
    goto :goto_1

    .line 116
    :cond_a
    :try_start_2
    iget-object p4, p2, Lp76;->b:Lmm6;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 117
    .line 118
    monitor-exit p2

    .line 119
    goto :goto_1

    .line 120
    :catchall_0
    move-exception p0

    .line 121
    monitor-exit p2

    .line 122
    throw p0

    .line 123
    :cond_b
    :goto_1
    if-eqz p4, :cond_c

    .line 124
    .line 125
    iput-object p4, p1, Lp42;->i:Lmm6;

    .line 126
    .line 127
    :goto_2
    move p1, p3

    .line 128
    goto :goto_4

    .line 129
    :cond_c
    iget-object p2, p1, Lp42;->d:Lb8;

    .line 130
    .line 131
    if-eqz p2, :cond_d

    .line 132
    .line 133
    invoke-virtual {p2}, Lb8;->h()Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-ne p2, p3, :cond_d

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_d
    iget-object p1, p1, Lp42;->e:Ld7;

    .line 141
    .line 142
    if-nez p1, :cond_e

    .line 143
    .line 144
    :goto_3
    goto :goto_2

    .line 145
    :cond_e
    invoke-virtual {p1}, Ld7;->x()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    :goto_4
    if-nez p1, :cond_10

    .line 150
    .line 151
    :cond_f
    :goto_5
    return p0

    .line 152
    :cond_10
    return p3
.end method
