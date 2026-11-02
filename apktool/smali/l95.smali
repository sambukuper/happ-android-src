.class public final Ll95;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final v0:Ljava/util/List;

.field public static final w0:Ljava/util/List;


# instance fields
.field public final X:Lz47;

.field public final Y:Lwl6;

.field public final Z:Ljava/util/List;

.field public final f0:Ljava/util/List;

.field public final g0:Ld61;

.field public final h0:Loq1;

.field public final i0:Ljava/net/Proxy;

.field public final j0:Ljava/net/ProxySelector;

.field public final k0:Ljavax/net/SocketFactory;

.field public final l0:Ljavax/net/ssl/SSLSocketFactory;

.field public final m0:Ljava/util/List;

.field public final n0:Ljava/util/List;

.field public final o0:Ljavax/net/ssl/HostnameVerifier;

.field public final p0:Lto0;

.field public final q0:I

.field public final r0:I

.field public final s0:I

.field public final t0:I

.field public final u0:Ljf6;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lp06;->g0:Lp06;

    .line 2
    .line 3
    sget-object v1, Lp06;->Z:Lp06;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lp06;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lks8;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Ll95;->v0:Ljava/util/List;

    .line 14
    .line 15
    sget-object v0, La21;->e:La21;

    .line 16
    .line 17
    sget-object v1, La21;->f:La21;

    .line 18
    .line 19
    filled-new-array {v0, v1}, [La21;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lks8;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Ll95;->w0:Ljava/util/List;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lk95;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lk95;->a:Lz47;

    .line 5
    .line 6
    iput-object v0, p0, Ll95;->X:Lz47;

    .line 7
    .line 8
    iget-object v0, p1, Lk95;->b:Lwl6;

    .line 9
    .line 10
    iput-object v0, p0, Ll95;->Y:Lwl6;

    .line 11
    .line 12
    iget-object v0, p1, Lk95;->c:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {v0}, Lks8;->u(Ljava/util/List;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Ll95;->Z:Ljava/util/List;

    .line 19
    .line 20
    iget-object v0, p1, Lk95;->d:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-static {v0}, Lks8;->u(Ljava/util/List;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Ll95;->f0:Ljava/util/List;

    .line 27
    .line 28
    iget-object v0, p1, Lk95;->f:Ld61;

    .line 29
    .line 30
    iput-object v0, p0, Ll95;->g0:Ld61;

    .line 31
    .line 32
    iget-object v0, p1, Lk95;->g:Loq1;

    .line 33
    .line 34
    iput-object v0, p0, Ll95;->h0:Loq1;

    .line 35
    .line 36
    iget-object v0, p1, Lk95;->h:Ljava/net/Proxy;

    .line 37
    .line 38
    iput-object v0, p0, Ll95;->i0:Ljava/net/Proxy;

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    sget-object v0, Lz65;->a:Lz65;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    sget-object v0, Lz65;->a:Lz65;

    .line 52
    .line 53
    :cond_1
    :goto_0
    iput-object v0, p0, Ll95;->j0:Ljava/net/ProxySelector;

    .line 54
    .line 55
    iget-object v0, p1, Lk95;->i:Ljavax/net/SocketFactory;

    .line 56
    .line 57
    iput-object v0, p0, Ll95;->k0:Ljavax/net/SocketFactory;

    .line 58
    .line 59
    iget-object v0, p1, Lk95;->l:Ljava/util/List;

    .line 60
    .line 61
    iput-object v0, p0, Ll95;->m0:Ljava/util/List;

    .line 62
    .line 63
    iget-object v1, p1, Lk95;->m:Ljava/util/List;

    .line 64
    .line 65
    iput-object v1, p0, Ll95;->n0:Ljava/util/List;

    .line 66
    .line 67
    iget-object v1, p1, Lk95;->n:Ljavax/net/ssl/HostnameVerifier;

    .line 68
    .line 69
    iput-object v1, p0, Ll95;->o0:Ljavax/net/ssl/HostnameVerifier;

    .line 70
    .line 71
    iget v1, p1, Lk95;->q:I

    .line 72
    .line 73
    iput v1, p0, Ll95;->q0:I

    .line 74
    .line 75
    iget v1, p1, Lk95;->r:I

    .line 76
    .line 77
    iput v1, p0, Ll95;->r0:I

    .line 78
    .line 79
    iget v1, p1, Lk95;->s:I

    .line 80
    .line 81
    iput v1, p0, Ll95;->s0:I

    .line 82
    .line 83
    iget v1, p1, Lk95;->t:I

    .line 84
    .line 85
    iput v1, p0, Ll95;->t0:I

    .line 86
    .line 87
    new-instance v1, Ljf6;

    .line 88
    .line 89
    invoke-direct {v1}, Ljf6;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v1, p0, Ll95;->u0:Ljf6;

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_2

    .line 102
    .line 103
    goto/16 :goto_3

    .line 104
    .line 105
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_7

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, La21;

    .line 120
    .line 121
    iget-boolean v2, v2, La21;->a:Z

    .line 122
    .line 123
    if-eqz v2, :cond_3

    .line 124
    .line 125
    iget-object v0, p1, Lk95;->j:Ljavax/net/ssl/SSLSocketFactory;

    .line 126
    .line 127
    if-eqz v0, :cond_5

    .line 128
    .line 129
    iput-object v0, p0, Ll95;->l0:Ljavax/net/ssl/SSLSocketFactory;

    .line 130
    .line 131
    iget-object v2, p1, Lk95;->p:Lg33;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-object v3, p1, Lk95;->k:Ljavax/net/ssl/X509TrustManager;

    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object p1, p1, Lk95;->o:Lto0;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget-object v4, p1, Lto0;->b:Lg33;

    .line 147
    .line 148
    invoke-static {v4, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_4

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_4
    new-instance v4, Lto0;

    .line 156
    .line 157
    iget-object p1, p1, Lto0;->a:Ljava/util/Set;

    .line 158
    .line 159
    invoke-direct {v4, p1, v2}, Lto0;-><init>(Ljava/util/Set;Lg33;)V

    .line 160
    .line 161
    .line 162
    move-object p1, v4

    .line 163
    :goto_1
    iput-object p1, p0, Ll95;->p0:Lto0;

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_5
    sget-object v0, Llo5;->a:Llo5;

    .line 167
    .line 168
    sget-object v0, Llo5;->a:Llo5;

    .line 169
    .line 170
    invoke-virtual {v0}, Llo5;->m()Ljavax/net/ssl/X509TrustManager;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    sget-object v0, Llo5;->a:Llo5;

    .line 175
    .line 176
    invoke-virtual {v0, v3}, Llo5;->l(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iput-object v0, p0, Ll95;->l0:Ljavax/net/ssl/SSLSocketFactory;

    .line 181
    .line 182
    sget-object v2, Llo5;->a:Llo5;

    .line 183
    .line 184
    invoke-virtual {v2, v3}, Llo5;->b(Ljavax/net/ssl/X509TrustManager;)Lg33;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    iget-object p1, p1, Lk95;->o:Lto0;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    iget-object v4, p1, Lto0;->b:Lg33;

    .line 194
    .line 195
    invoke-static {v4, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eqz v4, :cond_6

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_6
    new-instance v4, Lto0;

    .line 203
    .line 204
    iget-object p1, p1, Lto0;->a:Ljava/util/Set;

    .line 205
    .line 206
    invoke-direct {v4, p1, v2}, Lto0;-><init>(Ljava/util/Set;Lg33;)V

    .line 207
    .line 208
    .line 209
    move-object p1, v4

    .line 210
    :goto_2
    iput-object p1, p0, Ll95;->p0:Lto0;

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_7
    :goto_3
    iput-object v1, p0, Ll95;->l0:Ljavax/net/ssl/SSLSocketFactory;

    .line 214
    .line 215
    sget-object p1, Lto0;->c:Lto0;

    .line 216
    .line 217
    iput-object p1, p0, Ll95;->p0:Lto0;

    .line 218
    .line 219
    move-object v0, v1

    .line 220
    move-object v2, v0

    .line 221
    move-object v3, v2

    .line 222
    :goto_4
    iget-object p1, p0, Ll95;->f0:Ljava/util/List;

    .line 223
    .line 224
    iget-object v4, p0, Ll95;->Z:Ljava/util/List;

    .line 225
    .line 226
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-interface {v4, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-nez v5, :cond_13

    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    if-nez v4, :cond_12

    .line 243
    .line 244
    iget-object p1, p0, Ll95;->m0:Ljava/util/List;

    .line 245
    .line 246
    if-eqz p1, :cond_8

    .line 247
    .line 248
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    if-eqz v4, :cond_8

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-eqz v4, :cond_d

    .line 264
    .line 265
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    check-cast v4, La21;

    .line 270
    .line 271
    iget-boolean v4, v4, La21;->a:Z

    .line 272
    .line 273
    if-eqz v4, :cond_9

    .line 274
    .line 275
    if-eqz v0, :cond_c

    .line 276
    .line 277
    if-eqz v2, :cond_b

    .line 278
    .line 279
    if-eqz v3, :cond_a

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_a
    const-string p0, "x509TrustManager == null"

    .line 283
    .line 284
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v1

    .line 288
    :cond_b
    const-string p0, "certificateChainCleaner == null"

    .line 289
    .line 290
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw v1

    .line 294
    :cond_c
    const-string p0, "sslSocketFactory == null"

    .line 295
    .line 296
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v1

    .line 300
    :cond_d
    :goto_5
    const-string p1, "Check failed."

    .line 301
    .line 302
    if-nez v0, :cond_11

    .line 303
    .line 304
    if-nez v2, :cond_10

    .line 305
    .line 306
    if-nez v3, :cond_f

    .line 307
    .line 308
    iget-object p0, p0, Ll95;->p0:Lto0;

    .line 309
    .line 310
    sget-object v0, Lto0;->c:Lto0;

    .line 311
    .line 312
    invoke-static {p0, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result p0

    .line 316
    if-eqz p0, :cond_e

    .line 317
    .line 318
    :goto_6
    return-void

    .line 319
    :cond_e
    invoke-static {p1}, Lbt;->i(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw v1

    .line 323
    :cond_f
    invoke-static {p1}, Lbt;->i(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw v1

    .line 327
    :cond_10
    invoke-static {p1}, Lbt;->i(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    throw v1

    .line 331
    :cond_11
    invoke-static {p1}, Lbt;->i(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    throw v1

    .line 335
    :cond_12
    const-string p0, "Null network interceptor: "

    .line 336
    .line 337
    invoke-static {p1, p0}, Lxw3;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    throw v1

    .line 341
    :cond_13
    const-string p0, "Null interceptor: "

    .line 342
    .line 343
    invoke-static {v4, p0}, Lxw3;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    throw v1
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
