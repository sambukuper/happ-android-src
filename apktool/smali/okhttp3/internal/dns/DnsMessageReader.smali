.class public final Lokhttp3/internal/dns/DnsMessageReader;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\n\u001a\u00020\t*\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ&\u0010\n\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000eH\u0082\u0010\u00a2\u0006\u0004\u0008\n\u0010\u0011J#\u0010\u0015\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lokhttp3/internal/dns/DnsMessageReader;",
        "",
        "Lba0;",
        "source",
        "<init>",
        "(Lba0;)V",
        "Lokhttp3/internal/dns/Question;",
        "readQuestion",
        "(Lba0;)Lokhttp3/internal/dns/Question;",
        "",
        "readName",
        "(Lba0;)Ljava/lang/String;",
        "Li90;",
        "sink",
        "",
        "maxOffset",
        "Ldn8;",
        "(Lba0;Li90;I)V",
        "name",
        "timeToLive",
        "Lokhttp3/internal/dns/ResourceRecord$Https;",
        "readHttpsResourceRecord",
        "(Lba0;Ljava/lang/String;I)Lokhttp3/internal/dns/ResourceRecord$Https;",
        "Lokhttp3/internal/dns/DnsMessage;",
        "read",
        "()Lokhttp3/internal/dns/DnsMessage;",
        "Lokhttp3/internal/dns/ResourceRecord;",
        "readResourceRecord",
        "(Lba0;)Lokhttp3/internal/dns/ResourceRecord;",
        "sourceOffsetZero",
        "Lba0;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final source:Lba0;

.field private final sourceOffsetZero:Lba0;


# direct methods
.method public constructor <init>(Lba0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lokhttp3/internal/dns/DnsMessageReader;->sourceOffsetZero:Lba0;

    .line 8
    .line 9
    invoke-interface {p1}, Lba0;->peek()Lj76;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lokhttp3/internal/dns/DnsMessageReader;->source:Lba0;

    .line 14
    .line 15
    return-void
.end method

.method private final readHttpsResourceRecord(Lba0;Ljava/lang/String;I)Lokhttp3/internal/dns/ResourceRecord$Https;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-interface {v0}, Lba0;->readShort()S

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct/range {p0 .. p1}, Lokhttp3/internal/dns/DnsMessageReader;->readName(Lba0;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v6

    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/16 v5, 0x1bb

    .line 14
    .line 15
    move v8, v5

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v10, 0x0

    .line 19
    :goto_0
    invoke-interface {v0}, Lba0;->F()Z

    .line 20
    .line 21
    .line 22
    move-result v9

    .line 23
    const-string v11, "malformed HTTPS / no-default-alpn"

    .line 24
    .line 25
    const v12, 0xffff

    .line 26
    .line 27
    .line 28
    if-nez v9, :cond_10

    .line 29
    .line 30
    invoke-interface {v0}, Lba0;->readShort()S

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    and-int/2addr v9, v12

    .line 35
    if-le v9, v2, :cond_f

    .line 36
    .line 37
    invoke-interface {v0}, Lba0;->readShort()S

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    int-to-long v13, v2

    .line 42
    const-wide/32 v15, 0xffff

    .line 43
    .line 44
    .line 45
    and-long/2addr v13, v15

    .line 46
    move v2, v4

    .line 47
    const/16 p0, 0x0

    .line 48
    .line 49
    const-wide/16 v3, 0x2

    .line 50
    .line 51
    const-wide/16 v15, 0x0

    .line 52
    .line 53
    packed-switch v9, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, v13, v14}, Lba0;->skip(J)V

    .line 57
    .line 58
    .line 59
    move/from16 v19, v1

    .line 60
    .line 61
    move/from16 v20, v2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :pswitch_0
    if-nez v5, :cond_0

    .line 65
    .line 66
    new-instance v3, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    move-object v5, v3

    .line 72
    :cond_0
    const-wide/16 v3, 0x10

    .line 73
    .line 74
    rem-long v11, v13, v3

    .line 75
    .line 76
    cmp-long v11, v11, v15

    .line 77
    .line 78
    if-nez v11, :cond_4

    .line 79
    .line 80
    invoke-static {v13, v14}, Lx97;->b0(J)Lni4;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    invoke-static {v3, v4, v11}, Lx97;->X(JLni4;)Lli4;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    iget-wide v12, v11, Lli4;->X:J

    .line 89
    .line 90
    iget-wide v3, v11, Lli4;->Y:J

    .line 91
    .line 92
    move/from16 v19, v1

    .line 93
    .line 94
    move/from16 v20, v2

    .line 95
    .line 96
    iget-wide v1, v11, Lli4;->Z:J

    .line 97
    .line 98
    cmp-long v11, v1, v15

    .line 99
    .line 100
    if-lez v11, :cond_1

    .line 101
    .line 102
    cmp-long v14, v12, v3

    .line 103
    .line 104
    if-lez v14, :cond_2

    .line 105
    .line 106
    :cond_1
    if-gez v11, :cond_3

    .line 107
    .line 108
    cmp-long v11, v3, v12

    .line 109
    .line 110
    if-gtz v11, :cond_3

    .line 111
    .line 112
    :cond_2
    const-wide/16 v14, 0x10

    .line 113
    .line 114
    :goto_1
    invoke-interface {v0, v14, v15}, Lba0;->D0(J)[B

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    invoke-static {v11}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    invoke-interface {v5, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    cmp-long v11, v12, v3

    .line 126
    .line 127
    if-eqz v11, :cond_3

    .line 128
    .line 129
    add-long/2addr v12, v1

    .line 130
    goto :goto_1

    .line 131
    :cond_3
    :goto_2
    move v2, v9

    .line 132
    move/from16 v1, v19

    .line 133
    .line 134
    :goto_3
    move/from16 v4, v20

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_4
    const-string v0, "malformed HTTPS / ipv6hint"

    .line 138
    .line 139
    invoke-static {v0}, Lxw3;->k(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_1
    move/from16 v19, v1

    .line 144
    .line 145
    move/from16 v20, v2

    .line 146
    .line 147
    invoke-interface {v0, v13, v14}, Lba0;->s(J)Lkb0;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    move v2, v9

    .line 152
    goto :goto_3

    .line 153
    :pswitch_2
    move/from16 v19, v1

    .line 154
    .line 155
    move/from16 v20, v2

    .line 156
    .line 157
    new-instance v5, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 160
    .line 161
    .line 162
    const-wide/16 v1, 0x4

    .line 163
    .line 164
    rem-long v3, v13, v1

    .line 165
    .line 166
    cmp-long v3, v3, v15

    .line 167
    .line 168
    if-nez v3, :cond_7

    .line 169
    .line 170
    invoke-static {v13, v14}, Lx97;->b0(J)Lni4;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-static {v1, v2, v3}, Lx97;->X(JLni4;)Lli4;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    iget-wide v11, v3, Lli4;->X:J

    .line 179
    .line 180
    iget-wide v13, v3, Lli4;->Y:J

    .line 181
    .line 182
    iget-wide v3, v3, Lli4;->Z:J

    .line 183
    .line 184
    cmp-long v15, v3, v15

    .line 185
    .line 186
    if-lez v15, :cond_5

    .line 187
    .line 188
    cmp-long v16, v11, v13

    .line 189
    .line 190
    if-lez v16, :cond_6

    .line 191
    .line 192
    :cond_5
    if-gez v15, :cond_3

    .line 193
    .line 194
    cmp-long v15, v13, v11

    .line 195
    .line 196
    if-gtz v15, :cond_3

    .line 197
    .line 198
    :cond_6
    :goto_4
    invoke-interface {v0, v1, v2}, Lba0;->D0(J)[B

    .line 199
    .line 200
    .line 201
    move-result-object v15

    .line 202
    invoke-static {v15}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 203
    .line 204
    .line 205
    move-result-object v15

    .line 206
    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    cmp-long v15, v11, v13

    .line 210
    .line 211
    if-eqz v15, :cond_3

    .line 212
    .line 213
    add-long/2addr v11, v3

    .line 214
    goto :goto_4

    .line 215
    :cond_7
    const-string v0, "malformed HTTPS / ipv4hint"

    .line 216
    .line 217
    invoke-static {v0}, Lxw3;->k(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_3
    move/from16 v19, v1

    .line 222
    .line 223
    move/from16 v20, v2

    .line 224
    .line 225
    cmp-long v1, v13, v3

    .line 226
    .line 227
    if-nez v1, :cond_8

    .line 228
    .line 229
    invoke-interface {v0}, Lba0;->readShort()S

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    and-int v8, v1, v12

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_8
    const-string v0, "malformed HTTPS / port"

    .line 237
    .line 238
    invoke-static {v0}, Lxw3;->k(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    return-object p0

    .line 242
    :pswitch_4
    move/from16 v19, v1

    .line 243
    .line 244
    cmp-long v1, v13, v15

    .line 245
    .line 246
    if-nez v1, :cond_9

    .line 247
    .line 248
    const/4 v4, 0x1

    .line 249
    move v2, v9

    .line 250
    move/from16 v1, v19

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_9
    invoke-static {v11}, Lxw3;->k(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    return-object p0

    .line 258
    :pswitch_5
    move/from16 v19, v1

    .line 259
    .line 260
    move/from16 v20, v2

    .line 261
    .line 262
    new-instance v7, Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 265
    .line 266
    .line 267
    :goto_5
    cmp-long v1, v15, v13

    .line 268
    .line 269
    if-gez v1, :cond_3

    .line 270
    .line 271
    invoke-interface {v0}, Lba0;->readByte()B

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    int-to-long v1, v1

    .line 276
    const-wide/16 v3, 0xff

    .line 277
    .line 278
    and-long/2addr v1, v3

    .line 279
    const-wide/16 v3, 0x1

    .line 280
    .line 281
    add-long/2addr v15, v3

    .line 282
    add-long/2addr v15, v1

    .line 283
    cmp-long v3, v15, v13

    .line 284
    .line 285
    if-gtz v3, :cond_a

    .line 286
    .line 287
    invoke-interface {v0, v1, v2}, Lba0;->o(J)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_a
    const-string v0, "malformed HTTPS / alpn"

    .line 296
    .line 297
    invoke-static {v0}, Lxw3;->k(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    return-object p0

    .line 301
    :pswitch_6
    move/from16 v19, v1

    .line 302
    .line 303
    move/from16 v20, v2

    .line 304
    .line 305
    rem-long v1, v13, v3

    .line 306
    .line 307
    cmp-long v1, v1, v15

    .line 308
    .line 309
    if-nez v1, :cond_e

    .line 310
    .line 311
    invoke-static {v13, v14}, Lx97;->b0(J)Lni4;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-static {v3, v4, v1}, Lx97;->X(JLni4;)Lli4;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    iget-wide v2, v1, Lli4;->X:J

    .line 320
    .line 321
    iget-wide v13, v1, Lli4;->Y:J

    .line 322
    .line 323
    move v4, v12

    .line 324
    move-wide/from16 v17, v13

    .line 325
    .line 326
    iget-wide v12, v1, Lli4;->Z:J

    .line 327
    .line 328
    cmp-long v1, v12, v15

    .line 329
    .line 330
    if-lez v1, :cond_b

    .line 331
    .line 332
    cmp-long v11, v2, v17

    .line 333
    .line 334
    if-lez v11, :cond_c

    .line 335
    .line 336
    :cond_b
    if-gez v1, :cond_3

    .line 337
    .line 338
    cmp-long v1, v17, v2

    .line 339
    .line 340
    if-gtz v1, :cond_3

    .line 341
    .line 342
    :cond_c
    :goto_6
    invoke-interface {v0}, Lba0;->readShort()S

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    and-int/2addr v1, v4

    .line 347
    if-ltz v1, :cond_d

    .line 348
    .line 349
    const/4 v11, 0x7

    .line 350
    if-ge v1, v11, :cond_d

    .line 351
    .line 352
    cmp-long v1, v2, v17

    .line 353
    .line 354
    if-eqz v1, :cond_3

    .line 355
    .line 356
    add-long/2addr v2, v12

    .line 357
    goto :goto_6

    .line 358
    :cond_d
    new-instance v0, Ljava/net/ProtocolException;

    .line 359
    .line 360
    const-string v2, "unsupported HTTPS mandatory parameter "

    .line 361
    .line 362
    invoke-static {v1, v2}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    throw v0

    .line 370
    :cond_e
    const-string v0, "malformed HTTPS / mandatory"

    .line 371
    .line 372
    invoke-static {v0}, Lxw3;->k(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    return-object p0

    .line 376
    :cond_f
    const/16 p0, 0x0

    .line 377
    .line 378
    const-string v0, "malformed HTTPS resource record"

    .line 379
    .line 380
    invoke-static {v0}, Lxw3;->k(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    return-object p0

    .line 384
    :cond_10
    move/from16 v19, v1

    .line 385
    .line 386
    move/from16 v20, v4

    .line 387
    .line 388
    move v4, v12

    .line 389
    const/16 p0, 0x0

    .line 390
    .line 391
    if-eqz v20, :cond_12

    .line 392
    .line 393
    if-eqz v7, :cond_11

    .line 394
    .line 395
    goto :goto_7

    .line 396
    :cond_11
    invoke-static {v11}, Lxw3;->k(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    return-object p0

    .line 400
    :cond_12
    if-eqz v7, :cond_13

    .line 401
    .line 402
    sget-object v0, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    .line 403
    .line 404
    invoke-virtual {v0}, Lokhttp3/Protocol;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-interface {v7, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    if-nez v1, :cond_13

    .line 413
    .line 414
    invoke-virtual {v0}, Lokhttp3/Protocol;->toString()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-interface {v7, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    :cond_13
    :goto_7
    new-instance v2, Lokhttp3/internal/dns/ResourceRecord$Https;

    .line 422
    .line 423
    and-int v0, v19, v4

    .line 424
    .line 425
    if-nez v5, :cond_14

    .line 426
    .line 427
    sget-object v5, Ld02;->X:Ld02;

    .line 428
    .line 429
    :cond_14
    move-object/from16 v3, p2

    .line 430
    .line 431
    move/from16 v4, p3

    .line 432
    .line 433
    move-object v9, v5

    .line 434
    move v5, v0

    .line 435
    invoke-direct/range {v2 .. v10}, Lokhttp3/internal/dns/ResourceRecord$Https;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/util/List;ILjava/util/List;Lkb0;)V

    .line 436
    .line 437
    .line 438
    return-object v2

    .line 439
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

.method private final readName(Lba0;)Ljava/lang/String;
    .locals 6

    .line 82
    new-instance v2, Li90;

    .line 83
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 84
    invoke-static/range {v0 .. v5}, Lokhttp3/internal/dns/DnsMessageReader;->readName$default(Lokhttp3/internal/dns/DnsMessageReader;Lba0;Li90;IILjava/lang/Object;)V

    .line 85
    invoke-virtual {v2}, Li90;->Y()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final readName(Lba0;Li90;I)V
    .locals 6

    .line 1
    :goto_0
    invoke-interface {p1}, Lba0;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v1, v0, 0xc0

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x3f

    .line 8
    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    const/16 v2, 0x40

    .line 12
    .line 13
    if-eq v1, v2, :cond_2

    .line 14
    .line 15
    const/16 v2, 0x80

    .line 16
    .line 17
    if-eq v1, v2, :cond_2

    .line 18
    .line 19
    const/16 v2, 0xc0

    .line 20
    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    shl-int/lit8 v0, v0, 0x8

    .line 25
    .line 26
    invoke-interface {p1}, Lba0;->readByte()B

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    and-int/lit16 p1, p1, 0xff

    .line 31
    .line 32
    or-int/2addr p1, v0

    .line 33
    if-ge p1, p3, :cond_1

    .line 34
    .line 35
    iget-object p3, p0, Lokhttp3/internal/dns/DnsMessageReader;->sourceOffsetZero:Lba0;

    .line 36
    .line 37
    invoke-interface {p3}, Lba0;->peek()Lj76;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    int-to-long v0, p1

    .line 42
    invoke-virtual {p3, v0, v1}, Lj76;->skip(J)V

    .line 43
    .line 44
    .line 45
    move-object v5, p3

    .line 46
    move p3, p1

    .line 47
    move-object p1, v5

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const-string p0, "malformed DNS message"

    .line 50
    .line 51
    invoke-static {p0}, Lxw3;->k(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    const-string p0, "unsupported label type"

    .line 56
    .line 57
    invoke-static {p0}, Lxw3;->k(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    if-nez v0, :cond_4

    .line 62
    .line 63
    return-void

    .line 64
    :cond_4
    iget-wide v1, p2, Li90;->Y:J

    .line 65
    .line 66
    const-wide/16 v3, 0x0

    .line 67
    .line 68
    cmp-long v1, v1, v3

    .line 69
    .line 70
    if-lez v1, :cond_5

    .line 71
    .line 72
    const/16 v1, 0x2e

    .line 73
    .line 74
    invoke-virtual {p2, v1}, Li90;->H0(I)V

    .line 75
    .line 76
    .line 77
    :cond_5
    int-to-long v0, v0

    .line 78
    invoke-virtual {p2, p1, v0, v1}, Li90;->B0(Lba0;J)V

    .line 79
    .line 80
    .line 81
    goto :goto_0
.end method

.method public static synthetic readName$default(Lokhttp3/internal/dns/DnsMessageReader;Lba0;Li90;IILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const p3, 0x7fffffff

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lokhttp3/internal/dns/DnsMessageReader;->readName(Lba0;Li90;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final readQuestion(Lba0;)Lokhttp3/internal/dns/Question;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lokhttp3/internal/dns/DnsMessageReader;->readName(Lba0;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1}, Lba0;->readShort()S

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-interface {p1}, Lba0;->readShort()S

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    new-instance v1, Lokhttp3/internal/dns/Question;

    .line 14
    .line 15
    invoke-direct {v1, p0, v0, p1}, Lokhttp3/internal/dns/Question;-><init>(Ljava/lang/String;II)V

    .line 16
    .line 17
    .line 18
    return-object v1
.end method


# virtual methods
.method public final read()Lokhttp3/internal/dns/DnsMessage;
    .locals 10

    .line 1
    iget-object v0, p0, Lokhttp3/internal/dns/DnsMessageReader;->source:Lba0;

    .line 2
    .line 3
    invoke-interface {v0}, Lba0;->readShort()S

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    iget-object v0, p0, Lokhttp3/internal/dns/DnsMessageReader;->source:Lba0;

    .line 8
    .line 9
    invoke-interface {v0}, Lba0;->readShort()S

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    iget-object v0, p0, Lokhttp3/internal/dns/DnsMessageReader;->source:Lba0;

    .line 14
    .line 15
    invoke-interface {v0}, Lba0;->readShort()S

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const v1, 0xffff

    .line 20
    .line 21
    .line 22
    and-int/2addr v0, v1

    .line 23
    iget-object v4, p0, Lokhttp3/internal/dns/DnsMessageReader;->source:Lba0;

    .line 24
    .line 25
    invoke-interface {v4}, Lba0;->readShort()S

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    and-int/2addr v4, v1

    .line 30
    iget-object v5, p0, Lokhttp3/internal/dns/DnsMessageReader;->source:Lba0;

    .line 31
    .line 32
    invoke-interface {v5}, Lba0;->readShort()S

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    and-int/2addr v5, v1

    .line 37
    iget-object v6, p0, Lokhttp3/internal/dns/DnsMessageReader;->source:Lba0;

    .line 38
    .line 39
    invoke-interface {v6}, Lba0;->readShort()S

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    and-int/2addr v1, v6

    .line 44
    move v6, v4

    .line 45
    new-instance v4, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    move v8, v7

    .line 52
    :goto_0
    if-ge v8, v0, :cond_0

    .line 53
    .line 54
    iget-object v9, p0, Lokhttp3/internal/dns/DnsMessageReader;->source:Lba0;

    .line 55
    .line 56
    invoke-direct {p0, v9}, Lokhttp3/internal/dns/DnsMessageReader;->readQuestion(Lba0;)Lokhttp3/internal/dns/Question;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    add-int/lit8 v8, v8, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    .line 70
    .line 71
    move v8, v7

    .line 72
    :goto_1
    if-ge v8, v6, :cond_2

    .line 73
    .line 74
    iget-object v9, p0, Lokhttp3/internal/dns/DnsMessageReader;->source:Lba0;

    .line 75
    .line 76
    invoke-virtual {p0, v9}, Lokhttp3/internal/dns/DnsMessageReader;->readResourceRecord(Lba0;)Lokhttp3/internal/dns/ResourceRecord;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    if-nez v9, :cond_1

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_1
    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    move v8, v7

    .line 95
    :goto_3
    if-ge v8, v5, :cond_4

    .line 96
    .line 97
    iget-object v9, p0, Lokhttp3/internal/dns/DnsMessageReader;->source:Lba0;

    .line 98
    .line 99
    invoke-virtual {p0, v9}, Lokhttp3/internal/dns/DnsMessageReader;->readResourceRecord(Lba0;)Lokhttp3/internal/dns/ResourceRecord;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    if-nez v9, :cond_3

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_3
    invoke-interface {v6, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_4
    new-instance v5, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 115
    .line 116
    .line 117
    :goto_5
    iget-object v8, p0, Lokhttp3/internal/dns/DnsMessageReader;->source:Lba0;

    .line 118
    .line 119
    if-ge v7, v1, :cond_6

    .line 120
    .line 121
    invoke-virtual {p0, v8}, Lokhttp3/internal/dns/DnsMessageReader;->readResourceRecord(Lba0;)Lokhttp3/internal/dns/ResourceRecord;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    if-nez v8, :cond_5

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_5
    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_6
    invoke-interface {v8}, Lba0;->F()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_7

    .line 139
    .line 140
    iget-object p0, p0, Lokhttp3/internal/dns/DnsMessageReader;->sourceOffsetZero:Lba0;

    .line 141
    .line 142
    invoke-static {p0}, Lokhttp3/internal/_UtilJvmKt;->skipAll(Lba0;)V

    .line 143
    .line 144
    .line 145
    new-instance v1, Lokhttp3/internal/dns/DnsMessage;

    .line 146
    .line 147
    move-object v7, v5

    .line 148
    move-object v5, v0

    .line 149
    invoke-direct/range {v1 .. v7}, Lokhttp3/internal/dns/DnsMessage;-><init>(SILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 150
    .line 151
    .line 152
    return-object v1

    .line 153
    :cond_7
    const-string p0, "unexpected trailing data in message"

    .line 154
    .line 155
    invoke-static {p0}, Lxw3;->k(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    const/4 p0, 0x0

    .line 159
    return-object p0
.end method

.method public final readResourceRecord(Lba0;)Lokhttp3/internal/dns/ResourceRecord;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lokhttp3/internal/dns/DnsMessageReader;->readName(Lba0;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {p1}, Lba0;->readShort()S

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-interface {p1}, Lba0;->readShort()S

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-interface {p1}, Lba0;->readInt()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-interface {p1}, Lba0;->readShort()S

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    int-to-long v4, v4

    .line 25
    const-wide/32 v6, 0xffff

    .line 26
    .line 27
    .line 28
    and-long/2addr v4, v6

    .line 29
    const/4 v6, 0x0

    .line 30
    const-string v7, "unexpected record length"

    .line 31
    .line 32
    const/4 v8, 0x1

    .line 33
    if-ne v2, v8, :cond_1

    .line 34
    .line 35
    if-ne v1, v8, :cond_1

    .line 36
    .line 37
    const-wide/16 v1, 0x4

    .line 38
    .line 39
    cmp-long p0, v4, v1

    .line 40
    .line 41
    if-nez p0, :cond_0

    .line 42
    .line 43
    invoke-interface {p1, v1, v2}, Lba0;->D0(J)[B

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    new-instance p1, Lokhttp3/internal/dns/ResourceRecord$IpAddress;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, v0, v3, p0}, Lokhttp3/internal/dns/ResourceRecord$IpAddress;-><init>(Ljava/lang/String;ILjava/net/InetAddress;)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_0
    invoke-static {v7}, Lxw3;->k(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v6

    .line 64
    :cond_1
    if-ne v2, v8, :cond_3

    .line 65
    .line 66
    const/16 v9, 0x1c

    .line 67
    .line 68
    if-ne v1, v9, :cond_3

    .line 69
    .line 70
    const-wide/16 v1, 0x10

    .line 71
    .line 72
    cmp-long p0, v4, v1

    .line 73
    .line 74
    if-nez p0, :cond_2

    .line 75
    .line 76
    invoke-interface {p1, v1, v2}, Lba0;->D0(J)[B

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    new-instance p1, Lokhttp3/internal/dns/ResourceRecord$IpAddress;

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-direct {p1, v0, v3, p0}, Lokhttp3/internal/dns/ResourceRecord$IpAddress;-><init>(Ljava/lang/String;ILjava/net/InetAddress;)V

    .line 90
    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_2
    invoke-static {v7}, Lxw3;->k(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v6

    .line 97
    :cond_3
    if-ne v2, v8, :cond_4

    .line 98
    .line 99
    const/16 v2, 0x41

    .line 100
    .line 101
    if-ne v1, v2, :cond_4

    .line 102
    .line 103
    new-instance v1, Lt94;

    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    invoke-direct {v1, p1, v4, v5, v2}, Lt94;-><init>(Lje7;JZ)V

    .line 107
    .line 108
    .line 109
    new-instance p1, Lj76;

    .line 110
    .line 111
    invoke-direct {p1, v1}, Lj76;-><init>(Lje7;)V

    .line 112
    .line 113
    .line 114
    invoke-direct {p0, p1, v0, v3}, Lokhttp3/internal/dns/DnsMessageReader;->readHttpsResourceRecord(Lba0;Ljava/lang/String;I)Lokhttp3/internal/dns/ResourceRecord$Https;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0

    .line 119
    :cond_4
    invoke-interface {p1, v4, v5}, Lba0;->skip(J)V

    .line 120
    .line 121
    .line 122
    return-object v6
.end method
