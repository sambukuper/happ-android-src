.class public final Lokhttp3/internal/dns/DnsMessageWriter;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ&\u0010\u000f\u001a\u00020\u0008*\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u0082\u0010\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010 R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010$\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lokhttp3/internal/dns/DnsMessageWriter;",
        "",
        "Li90;",
        "sink",
        "<init>",
        "(Li90;)V",
        "Lokhttp3/internal/dns/Question;",
        "question",
        "Ldn8;",
        "writeQuestion",
        "(Lokhttp3/internal/dns/Question;)V",
        "Lkb0;",
        "name",
        "",
        "receiverOffset",
        "writeName",
        "(Li90;Lkb0;J)V",
        "Lokhttp3/internal/dns/ResourceRecord;",
        "resourceRecord",
        "writeResourceRecord",
        "(Lokhttp3/internal/dns/ResourceRecord;)V",
        "Lokhttp3/internal/dns/ResourceRecord$IpAddress;",
        "record",
        "writeIpAddress",
        "(Lokhttp3/internal/dns/ResourceRecord$IpAddress;)V",
        "Lokhttp3/internal/dns/ResourceRecord$Https;",
        "writeHttps",
        "(Lokhttp3/internal/dns/ResourceRecord$Https;)V",
        "Lokhttp3/internal/dns/DnsMessage;",
        "message",
        "write",
        "(Lokhttp3/internal/dns/DnsMessage;)V",
        "Li90;",
        "",
        "labelToOffset",
        "Ljava/util/Map;",
        "messageStart",
        "J",
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
.field private final labelToOffset:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lkb0;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final messageStart:J

.field private final sink:Li90;


# direct methods
.method public constructor <init>(Li90;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 8
    .line 9
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lokhttp3/internal/dns/DnsMessageWriter;->labelToOffset:Ljava/util/Map;

    .line 15
    .line 16
    iget-wide v0, p1, Li90;->Y:J

    .line 17
    .line 18
    iput-wide v0, p0, Lokhttp3/internal/dns/DnsMessageWriter;->messageStart:J

    .line 19
    .line 20
    return-void
.end method

.method private final writeHttps(Lokhttp3/internal/dns/ResourceRecord$Https;)V
    .locals 12

    .line 1
    iget-object v1, p0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 2
    .line 3
    sget-object v0, Lkb0;->f0:Lkb0;

    .line 4
    .line 5
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$Https;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lra;->g(Ljava/lang/String;)Lkb0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x0

    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    invoke-static/range {v0 .. v6}, Lokhttp3/internal/dns/DnsMessageWriter;->writeName$default(Lokhttp3/internal/dns/DnsMessageWriter;Li90;Lkb0;JILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, v0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 22
    .line 23
    const/16 v1, 0x41

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Li90;->a1(I)V

    .line 26
    .line 27
    .line 28
    iget-object p0, v0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-virtual {p0, v1}, Li90;->a1(I)V

    .line 32
    .line 33
    .line 34
    iget-object p0, v0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 35
    .line 36
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$Https;->getTimeToLive()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {p0, v2}, Li90;->Z0(I)V

    .line 41
    .line 42
    .line 43
    new-instance p0, Li90;

    .line 44
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$Https;->getPriority()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p0, v2}, Li90;->a1(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$Https;->getTargetName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v2}, Lra;->g(Ljava/lang/String;)Lkb0;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget-object v3, v0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 64
    .line 65
    iget-wide v3, v3, Li90;->Y:J

    .line 66
    .line 67
    const-wide/16 v5, 0x2

    .line 68
    .line 69
    add-long/2addr v3, v5

    .line 70
    invoke-direct {v0, p0, v2, v3, v4}, Lokhttp3/internal/dns/DnsMessageWriter;->writeName(Li90;Lkb0;J)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$Https;->getAlpnIds()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const/4 v3, 0x2

    .line 78
    const/4 v4, 0x0

    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Li90;->a1(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$Https;->getAlpnIds()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    new-instance v2, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_1

    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    move-object v6, v5

    .line 108
    check-cast v6, Ljava/lang/String;

    .line 109
    .line 110
    sget-object v7, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    .line 111
    .line 112
    invoke-virtual {v7}, Lokhttp3/Protocol;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-static {v6, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-nez v6, :cond_0

    .line 121
    .line 122
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    const-wide/16 v5, 0x0

    .line 131
    .line 132
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_2

    .line 137
    .line 138
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    check-cast v7, Ljava/lang/String;

    .line 143
    .line 144
    const-wide/16 v8, 0x1

    .line 145
    .line 146
    invoke-static {v7}, Lct7;->g(Ljava/lang/String;)J

    .line 147
    .line 148
    .line 149
    move-result-wide v10

    .line 150
    add-long/2addr v10, v8

    .line 151
    add-long/2addr v5, v10

    .line 152
    goto :goto_1

    .line 153
    :cond_2
    long-to-int v1, v5

    .line 154
    invoke-virtual {p0, v1}, Li90;->a1(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_3

    .line 166
    .line 167
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Ljava/lang/String;

    .line 172
    .line 173
    invoke-static {v2}, Lct7;->g(Ljava/lang/String;)J

    .line 174
    .line 175
    .line 176
    move-result-wide v5

    .line 177
    long-to-int v5, v5

    .line 178
    invoke-virtual {p0, v5}, Li90;->H0(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v2}, Li90;->d1(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_3
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$Https;->getAlpnIds()Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    sget-object v2, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    .line 190
    .line 191
    invoke-virtual {v2}, Lokhttp3/Protocol;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-nez v1, :cond_4

    .line 200
    .line 201
    invoke-virtual {p0, v3}, Li90;->a1(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, v4}, Li90;->a1(I)V

    .line 205
    .line 206
    .line 207
    :cond_4
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$Https;->getPort()I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    const/16 v2, 0x1bb

    .line 212
    .line 213
    if-eq v1, v2, :cond_5

    .line 214
    .line 215
    const/4 v1, 0x3

    .line 216
    invoke-virtual {p0, v1}, Li90;->a1(I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0, v3}, Li90;->a1(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$Https;->getPort()I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-virtual {p0, v1}, Li90;->a1(I)V

    .line 227
    .line 228
    .line 229
    :cond_5
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$Https;->getIpAddressHints()Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    new-instance v2, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-eqz v3, :cond_7

    .line 247
    .line 248
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    instance-of v5, v3, Ljava/net/Inet4Address;

    .line 253
    .line 254
    if-eqz v5, :cond_6

    .line 255
    .line 256
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-nez v1, :cond_8

    .line 265
    .line 266
    const/4 v1, 0x4

    .line 267
    invoke-virtual {p0, v1}, Li90;->a1(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    mul-int/2addr v3, v1

    .line 275
    invoke-virtual {p0, v3}, Li90;->a1(I)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    if-eqz v2, :cond_8

    .line 287
    .line 288
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    check-cast v2, Ljava/net/Inet4Address;

    .line 293
    .line 294
    invoke-virtual {v2}, Ljava/net/Inet4Address;->getAddress()[B

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    array-length v3, v2

    .line 302
    invoke-virtual {p0, v2, v4, v3}, Li90;->write([BII)V

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_8
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$Https;->getEchConfigList()Lkb0;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    if-eqz v1, :cond_9

    .line 311
    .line 312
    const/4 v1, 0x5

    .line 313
    invoke-virtual {p0, v1}, Li90;->a1(I)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$Https;->getEchConfigList()Lkb0;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-virtual {v1}, Lkb0;->e()I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    invoke-virtual {p0, v1}, Li90;->a1(I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$Https;->getEchConfigList()Lkb0;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-virtual {p0, v1}, Li90;->C0(Lkb0;)V

    .line 332
    .line 333
    .line 334
    :cond_9
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$Https;->getIpAddressHints()Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    new-instance v1, Ljava/util/ArrayList;

    .line 339
    .line 340
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 341
    .line 342
    .line 343
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    :cond_a
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    if-eqz v2, :cond_b

    .line 352
    .line 353
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    instance-of v3, v2, Ljava/net/Inet6Address;

    .line 358
    .line 359
    if-eqz v3, :cond_a

    .line 360
    .line 361
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    goto :goto_5

    .line 365
    :cond_b
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    if-nez p1, :cond_c

    .line 370
    .line 371
    const/4 p1, 0x6

    .line 372
    invoke-virtual {p0, p1}, Li90;->a1(I)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 376
    .line 377
    .line 378
    move-result p1

    .line 379
    mul-int/lit8 p1, p1, 0x10

    .line 380
    .line 381
    invoke-virtual {p0, p1}, Li90;->a1(I)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    if-eqz v1, :cond_c

    .line 393
    .line 394
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    check-cast v1, Ljava/net/Inet6Address;

    .line 399
    .line 400
    invoke-virtual {v1}, Ljava/net/Inet6Address;->getAddress()[B

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    array-length v2, v1

    .line 408
    invoke-virtual {p0, v1, v4, v2}, Li90;->write([BII)V

    .line 409
    .line 410
    .line 411
    goto :goto_6

    .line 412
    :cond_c
    iget-wide v1, p0, Li90;->Y:J

    .line 413
    .line 414
    const-wide/32 v3, 0xffff

    .line 415
    .line 416
    .line 417
    cmp-long p1, v1, v3

    .line 418
    .line 419
    if-gez p1, :cond_d

    .line 420
    .line 421
    iget-object p1, v0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 422
    .line 423
    long-to-int v1, v1

    .line 424
    invoke-virtual {p1, v1}, Li90;->a1(I)V

    .line 425
    .line 426
    .line 427
    iget-object p1, v0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 428
    .line 429
    invoke-virtual {p1, p0}, Li90;->M(Lje7;)J

    .line 430
    .line 431
    .line 432
    return-void

    .line 433
    :cond_d
    const-string p0, "record too long"

    .line 434
    .line 435
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    return-void
.end method

.method private final writeIpAddress(Lokhttp3/internal/dns/ResourceRecord$IpAddress;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->getAddress()Ljava/net/InetAddress;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v2, p0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 10
    .line 11
    sget-object v1, Lkb0;->f0:Lkb0;

    .line 12
    .line 13
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Lra;->g(Ljava/lang/String;)Lkb0;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v6, 0x2

    .line 22
    const/4 v7, 0x0

    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    move-object v1, p0

    .line 26
    invoke-static/range {v1 .. v7}, Lokhttp3/internal/dns/DnsMessageWriter;->writeName$default(Lokhttp3/internal/dns/DnsMessageWriter;Li90;Lkb0;JILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, v1, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 30
    .line 31
    array-length v2, v0

    .line 32
    const/4 v3, 0x4

    .line 33
    const/4 v4, 0x1

    .line 34
    if-eq v2, v3, :cond_1

    .line 35
    .line 36
    const/16 v3, 0x10

    .line 37
    .line 38
    if-ne v2, v3, :cond_0

    .line 39
    .line 40
    const/16 v2, 0x1c

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-string p0, "unexpected address"

    .line 44
    .line 45
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    move v2, v4

    .line 50
    :goto_0
    invoke-virtual {p0, v2}, Li90;->a1(I)V

    .line 51
    .line 52
    .line 53
    iget-object p0, v1, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 54
    .line 55
    invoke-virtual {p0, v4}, Li90;->a1(I)V

    .line 56
    .line 57
    .line 58
    iget-object p0, v1, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 59
    .line 60
    invoke-virtual {p1}, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->getTimeToLive()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {p0, p1}, Li90;->Z0(I)V

    .line 65
    .line 66
    .line 67
    iget-object p0, v1, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 68
    .line 69
    array-length p1, v0

    .line 70
    invoke-virtual {p0, p1}, Li90;->a1(I)V

    .line 71
    .line 72
    .line 73
    iget-object p0, v1, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    array-length v1, v0

    .line 80
    invoke-virtual {p0, v0, p1, v1}, Li90;->write([BII)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method private final writeName(Li90;Lkb0;J)V
    .locals 6

    .line 1
    :goto_0
    invoke-virtual {p2}, Lkb0;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Li90;->H0(I)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/dns/DnsMessageWriter;->labelToOffset:Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Long;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide p2

    .line 26
    long-to-int p0, p2

    .line 27
    const p2, 0xc000

    .line 28
    .line 29
    .line 30
    or-int/2addr p0, p2

    .line 31
    invoke-virtual {p1, p0}, Li90;->a1(I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/dns/DnsMessageWriter;->labelToOffset:Ljava/util/Map;

    .line 36
    .line 37
    iget-wide v2, p1, Li90;->Y:J

    .line 38
    .line 39
    add-long/2addr v2, p3

    .line 40
    iget-wide v4, p0, Lokhttp3/internal/dns/DnsMessageWriter;->messageStart:J

    .line 41
    .line 42
    sub-long/2addr v2, v4

    .line 43
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v0, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lokhttp3/internal/dns/_DnsMessageWriterKt;->access$getLABEL_SEPARATOR$p()Lkb0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {p2, v0}, Lkb0;->h(Lkb0;Lkb0;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/4 v2, -0x1

    .line 59
    const-string v3, "label too long"

    .line 60
    .line 61
    const/16 v4, 0x40

    .line 62
    .line 63
    if-ne v0, v2, :cond_3

    .line 64
    .line 65
    invoke-virtual {p2}, Lkb0;->e()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-ge p0, v4, :cond_2

    .line 70
    .line 71
    invoke-virtual {p2}, Lkb0;->e()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    invoke-virtual {p1, p0}, Li90;->H0(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p2}, Li90;->C0(Lkb0;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v1}, Li90;->H0(I)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_2
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_3
    if-ge v0, v4, :cond_4

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Li90;->H0(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v0, p1}, Lkb0;->u(ILi90;)V

    .line 95
    .line 96
    .line 97
    add-int/lit8 v0, v0, 0x1

    .line 98
    .line 99
    const/4 v2, 0x2

    .line 100
    invoke-static {p2, v0, v1, v2}, Lkb0;->q(Lkb0;III)Lkb0;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    goto :goto_0

    .line 105
    :cond_4
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public static synthetic writeName$default(Lokhttp3/internal/dns/DnsMessageWriter;Li90;Lkb0;JILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const-wide/16 p3, 0x0

    .line 6
    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lokhttp3/internal/dns/DnsMessageWriter;->writeName(Li90;Lkb0;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final writeQuestion(Lokhttp3/internal/dns/Question;)V
    .locals 7

    .line 1
    iget-object v1, p0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 2
    .line 3
    sget-object v0, Lkb0;->f0:Lkb0;

    .line 4
    .line 5
    invoke-virtual {p1}, Lokhttp3/internal/dns/Question;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lra;->g(Ljava/lang/String;)Lkb0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x0

    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    invoke-static/range {v0 .. v6}, Lokhttp3/internal/dns/DnsMessageWriter;->writeName$default(Lokhttp3/internal/dns/DnsMessageWriter;Li90;Lkb0;JILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, v0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 22
    .line 23
    invoke-virtual {p1}, Lokhttp3/internal/dns/Question;->getType()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p0, v1}, Li90;->a1(I)V

    .line 28
    .line 29
    .line 30
    iget-object p0, v0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 31
    .line 32
    invoke-virtual {p1}, Lokhttp3/internal/dns/Question;->getClass()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {p0, p1}, Li90;->a1(I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private final writeResourceRecord(Lokhttp3/internal/dns/ResourceRecord;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lokhttp3/internal/dns/ResourceRecord$Https;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lokhttp3/internal/dns/ResourceRecord$Https;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lokhttp3/internal/dns/DnsMessageWriter;->writeHttps(Lokhttp3/internal/dns/ResourceRecord$Https;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v0, p1, Lokhttp3/internal/dns/ResourceRecord$IpAddress;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p1, Lokhttp3/internal/dns/ResourceRecord$IpAddress;

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lokhttp3/internal/dns/DnsMessageWriter;->writeIpAddress(Lokhttp3/internal/dns/ResourceRecord$IpAddress;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-static {}, Lb61;->c()V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final write(Lokhttp3/internal/dns/DnsMessage;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 5
    .line 6
    invoke-virtual {p1}, Lokhttp3/internal/dns/DnsMessage;->getId()S

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, v1}, Li90;->a1(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 14
    .line 15
    invoke-virtual {p1}, Lokhttp3/internal/dns/DnsMessage;->getFlags()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0, v1}, Li90;->a1(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 23
    .line 24
    invoke-virtual {p1}, Lokhttp3/internal/dns/DnsMessage;->getQuestions()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0, v1}, Li90;->a1(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 36
    .line 37
    invoke-virtual {p1}, Lokhttp3/internal/dns/DnsMessage;->getAnswers()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {v0, v1}, Li90;->a1(I)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 49
    .line 50
    invoke-virtual {p1}, Lokhttp3/internal/dns/DnsMessage;->getAuthorityRecords()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {v0, v1}, Li90;->a1(I)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lokhttp3/internal/dns/DnsMessageWriter;->sink:Li90;

    .line 62
    .line 63
    invoke-virtual {p1}, Lokhttp3/internal/dns/DnsMessage;->getAdditionalRecords()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {v0, v1}, Li90;->a1(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lokhttp3/internal/dns/DnsMessage;->getQuestions()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_0

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lokhttp3/internal/dns/Question;

    .line 93
    .line 94
    invoke-direct {p0, v1}, Lokhttp3/internal/dns/DnsMessageWriter;->writeQuestion(Lokhttp3/internal/dns/Question;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    invoke-virtual {p1}, Lokhttp3/internal/dns/DnsMessage;->getAnswers()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_1

    .line 111
    .line 112
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, Lokhttp3/internal/dns/ResourceRecord;

    .line 117
    .line 118
    invoke-direct {p0, v1}, Lokhttp3/internal/dns/DnsMessageWriter;->writeResourceRecord(Lokhttp3/internal/dns/ResourceRecord;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_1
    invoke-virtual {p1}, Lokhttp3/internal/dns/DnsMessage;->getAuthorityRecords()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_2

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Lokhttp3/internal/dns/ResourceRecord;

    .line 141
    .line 142
    invoke-direct {p0, v1}, Lokhttp3/internal/dns/DnsMessageWriter;->writeResourceRecord(Lokhttp3/internal/dns/ResourceRecord;)V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_2
    invoke-virtual {p1}, Lokhttp3/internal/dns/DnsMessage;->getAdditionalRecords()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_3

    .line 159
    .line 160
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, Lokhttp3/internal/dns/ResourceRecord;

    .line 165
    .line 166
    invoke-direct {p0, v0}, Lokhttp3/internal/dns/DnsMessageWriter;->writeResourceRecord(Lokhttp3/internal/dns/ResourceRecord;)V

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_3
    return-void
.end method
