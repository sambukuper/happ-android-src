.class public final Llt5;
.super Lhq8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final x:Ljt5;

.field public static final y:Ljava/util/concurrent/ScheduledExecutorService;


# instance fields
.field public q:Lkt5;

.field public r:Ljava/util/concurrent/Executor;

.field public s:Lb57;

.field public t:Lv73;

.field public u:Lxx7;

.field public v:Lhy7;

.field public w:Lc57;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljt5;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Llt5;->x:Ljt5;

    .line 7
    .line 8
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Llt5;->y:Ljava/util/concurrent/ScheduledExecutorService;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final A(Liz;Liz;)Liz;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    const-string p2, "Preview"

    .line 8
    .line 9
    invoke-static {p2}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Lhq8;->h:Ler8;

    .line 13
    .line 14
    check-cast p2, Lmt5;

    .line 15
    .line 16
    invoke-virtual {p0, p2, p1}, Llt5;->K(Lmt5;Liz;)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method public final B()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Llt5;->I()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final E(Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lhq8;->k:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Llt5;->u:Lxx7;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lhq8;->o(Lcj0;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p0, p1, v1}, Lhq8;->i(Lcj0;Z)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object p0, p0, Lhq8;->h:Ler8;

    .line 22
    .line 23
    check-cast p0, Li63;

    .line 24
    .line 25
    sget-object v1, Li63;->u:Lzx;

    .line 26
    .line 27
    const/4 v2, -0x1

    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {p0, v1, v2}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    new-instance v1, Lvx7;

    .line 43
    .line 44
    invoke-direct {v1, v0, p1, p0}, Lvx7;-><init>(Lxx7;II)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Ls08;->g(Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
.end method

.method public final I()V
    .locals 3

    .line 1
    iget-object v0, p0, Llt5;->w:Lc57;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lc57;->b()V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Llt5;->w:Lc57;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Llt5;->t:Lv73;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lwg1;->a()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Llt5;->t:Lv73;

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Llt5;->u:Lxx7;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Lxx7;->b()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Llt5;->u:Lxx7;

    .line 28
    .line 29
    :cond_2
    iget-object v0, p0, Llt5;->v:Lhy7;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    iget-object v2, v0, Lhy7;->a:Ljava/lang/Object;

    .line 34
    .line 35
    monitor-enter v2

    .line 36
    :try_start_0
    iput-object v1, v0, Lhy7;->m:Lgy7;

    .line 37
    .line 38
    iput-object v1, v0, Lhy7;->n:Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    monitor-exit v2

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p0

    .line 45
    :cond_3
    :goto_0
    iput-object v1, p0, Llt5;->v:Lhy7;

    .line 46
    .line 47
    return-void
.end method

.method public final J(Lkt5;)V
    .locals 1

    .line 1
    invoke-static {}, Ls08;->b()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Llt5;->q:Lkt5;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    iput p1, p0, Lhq8;->d:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lhq8;->s()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iput-object p1, p0, Llt5;->q:Lkt5;

    .line 17
    .line 18
    sget-object p1, Llt5;->y:Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    .line 20
    iput-object p1, p0, Llt5;->r:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    invoke-virtual {p0}, Lhq8;->c()Landroid/util/Size;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lhq8;->h:Ler8;

    .line 29
    .line 30
    check-cast p1, Lmt5;

    .line 31
    .line 32
    iget-object v0, p0, Lhq8;->i:Liz;

    .line 33
    .line 34
    invoke-virtual {p0, p1, v0}, Llt5;->K(Lmt5;Liz;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lhq8;->r()V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {p0}, Lhq8;->q()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final K(Lmt5;Liz;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p2

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v11

    .line 10
    invoke-static {}, Ls08;->b()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lhq8;->d()Lcj0;

    .line 14
    .line 15
    .line 16
    move-result-object v12

    .line 17
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Llt5;->I()V

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, Llt5;->u:Lxx7;

    .line 24
    .line 25
    const/4 v13, 0x0

    .line 26
    const/4 v14, 0x1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    move v1, v14

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v1, v13

    .line 32
    :goto_0
    const/4 v2, 0x0

    .line 33
    invoke-static {v2, v1}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lxx7;

    .line 37
    .line 38
    iget-object v5, v0, Lhq8;->l:Landroid/graphics/Matrix;

    .line 39
    .line 40
    invoke-interface {v12}, Lcj0;->q()Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    iget-object v3, v4, Liz;->a:Landroid/util/Size;

    .line 45
    .line 46
    iget-object v7, v0, Lhq8;->k:Landroid/graphics/Rect;

    .line 47
    .line 48
    if-eqz v7, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    if-eqz v3, :cond_2

    .line 52
    .line 53
    new-instance v2, Landroid/graphics/Rect;

    .line 54
    .line 55
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-direct {v2, v13, v13, v7, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 64
    .line 65
    .line 66
    :cond_2
    move-object v7, v2

    .line 67
    :goto_1
    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v12}, Lhq8;->o(Lcj0;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-virtual {v0, v12, v2}, Lhq8;->i(Lcj0;Z)I

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    iget-object v2, v0, Lhq8;->h:Ler8;

    .line 79
    .line 80
    check-cast v2, Li63;

    .line 81
    .line 82
    sget-object v15, Li63;->u:Lzx;

    .line 83
    .line 84
    invoke-interface {v2, v15, v11}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    invoke-interface {v12}, Lcj0;->q()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_3

    .line 99
    .line 100
    invoke-virtual {v0, v12}, Lhq8;->o(Lcj0;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_3

    .line 105
    .line 106
    move v10, v14

    .line 107
    goto :goto_2

    .line 108
    :cond_3
    move v10, v13

    .line 109
    :goto_2
    const/4 v2, 0x1

    .line 110
    const/16 v3, 0x22

    .line 111
    .line 112
    invoke-direct/range {v1 .. v10}, Lxx7;-><init>(IILiz;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    .line 113
    .line 114
    .line 115
    iput-object v1, v0, Llt5;->u:Lxx7;

    .line 116
    .line 117
    new-instance v2, Lc1;

    .line 118
    .line 119
    const/16 v3, 0x1b

    .line 120
    .line 121
    invoke-direct {v2, v0, v3}, Lc1;-><init>(Ljava/lang/Object;B)V

    .line 122
    .line 123
    .line 124
    invoke-static {}, Ls08;->b()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lxx7;->a()V

    .line 128
    .line 129
    .line 130
    iget-object v1, v1, Lxx7;->m:Ljava/util/HashSet;

    .line 131
    .line 132
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    iget-object v1, v0, Llt5;->u:Lxx7;

    .line 136
    .line 137
    invoke-virtual {v1, v12, v14}, Lxx7;->c(Lcj0;Z)Lhy7;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iput-object v1, v0, Llt5;->v:Lhy7;

    .line 142
    .line 143
    iget-object v1, v1, Lhy7;->k:Lv73;

    .line 144
    .line 145
    iput-object v1, v0, Llt5;->t:Lv73;

    .line 146
    .line 147
    iget-object v1, v0, Llt5;->q:Lkt5;

    .line 148
    .line 149
    if-eqz v1, :cond_5

    .line 150
    .line 151
    invoke-virtual {v0}, Lhq8;->d()Lcj0;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iget-object v2, v0, Llt5;->u:Lxx7;

    .line 156
    .line 157
    if-eqz v1, :cond_4

    .line 158
    .line 159
    if-eqz v2, :cond_4

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Lhq8;->o(Lcj0;)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    invoke-virtual {v0, v1, v3}, Lhq8;->i(Lcj0;Z)I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    iget-object v3, v0, Lhq8;->h:Ler8;

    .line 170
    .line 171
    check-cast v3, Li63;

    .line 172
    .line 173
    invoke-interface {v3, v15, v11}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    check-cast v3, Ljava/lang/Integer;

    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    new-instance v5, Lvx7;

    .line 184
    .line 185
    invoke-direct {v5, v2, v1, v3}, Lvx7;-><init>(Lxx7;II)V

    .line 186
    .line 187
    .line 188
    invoke-static {v5}, Ls08;->g(Ljava/lang/Runnable;)V

    .line 189
    .line 190
    .line 191
    :cond_4
    iget-object v1, v0, Llt5;->q:Lkt5;

    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object v2, v0, Llt5;->v:Lhy7;

    .line 197
    .line 198
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-object v3, v0, Llt5;->r:Ljava/util/concurrent/Executor;

    .line 202
    .line 203
    new-instance v5, Lsc4;

    .line 204
    .line 205
    const/4 v6, 0x5

    .line 206
    invoke-direct {v5, v1, v2, v6}, Lsc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 207
    .line 208
    .line 209
    invoke-interface {v3, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 210
    .line 211
    .line 212
    :cond_5
    iget-object v1, v4, Liz;->a:Landroid/util/Size;

    .line 213
    .line 214
    move-object/from16 v2, p1

    .line 215
    .line 216
    invoke-static {v2, v1}, Lb57;->d(Ler8;Landroid/util/Size;)Lb57;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    iget-object v3, v1, La57;->b:Lxm0;

    .line 221
    .line 222
    iget v5, v4, Liz;->d:I

    .line 223
    .line 224
    iput v5, v1, La57;->h:I

    .line 225
    .line 226
    invoke-virtual {v0, v1, v4}, Lhq8;->a(Lb57;Liz;)V

    .line 227
    .line 228
    .line 229
    invoke-interface {v2}, Ler8;->B()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-eqz v2, :cond_6

    .line 234
    .line 235
    if-eqz v2, :cond_6

    .line 236
    .line 237
    sget-object v5, Ler8;->a0:Lzx;

    .line 238
    .line 239
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    iget-object v6, v3, Lxm0;->g0:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v6, Lk05;

    .line 246
    .line 247
    invoke-virtual {v6, v5, v2}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    :cond_6
    iget-object v2, v4, Liz;->f:Ll11;

    .line 251
    .line 252
    if-eqz v2, :cond_7

    .line 253
    .line 254
    invoke-virtual {v3, v2}, Lxm0;->d(Ll11;)V

    .line 255
    .line 256
    .line 257
    :cond_7
    iget-object v2, v0, Llt5;->q:Lkt5;

    .line 258
    .line 259
    if-eqz v2, :cond_8

    .line 260
    .line 261
    iget-object v2, v0, Llt5;->t:Lv73;

    .line 262
    .line 263
    iget-object v3, v4, Liz;->c:Lpx1;

    .line 264
    .line 265
    iget-object v4, v0, Lhq8;->h:Ler8;

    .line 266
    .line 267
    check-cast v4, Li63;

    .line 268
    .line 269
    sget-object v5, Li63;->v:Lzx;

    .line 270
    .line 271
    invoke-interface {v4, v5, v11}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    check-cast v4, Ljava/lang/Integer;

    .line 276
    .line 277
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    invoke-virtual {v1, v2, v3, v4}, Lb57;->b(Lwg1;Lpx1;I)V

    .line 282
    .line 283
    .line 284
    :cond_8
    iget-object v2, v0, Llt5;->w:Lc57;

    .line 285
    .line 286
    if-eqz v2, :cond_9

    .line 287
    .line 288
    invoke-virtual {v2}, Lc57;->b()V

    .line 289
    .line 290
    .line 291
    :cond_9
    new-instance v2, Lc57;

    .line 292
    .line 293
    new-instance v3, Lt53;

    .line 294
    .line 295
    invoke-direct {v3, v0, v14}, Lt53;-><init>(Ljava/lang/Object;B)V

    .line 296
    .line 297
    .line 298
    invoke-direct {v2, v3}, Lc57;-><init>(Ld57;)V

    .line 299
    .line 300
    .line 301
    iput-object v2, v0, Llt5;->w:Lc57;

    .line 302
    .line 303
    iput-object v2, v1, La57;->f:Lc57;

    .line 304
    .line 305
    iput-object v1, v0, Llt5;->s:Lb57;

    .line 306
    .line 307
    invoke-virtual {v1}, Lb57;->c()Lf57;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    new-instance v2, Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-direct {v2, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 318
    .line 319
    .line 320
    aget-object v1, v1, v13

    .line 321
    .line 322
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-virtual {v0, v1}, Lhq8;->G(Ljava/util/List;)V

    .line 333
    .line 334
    .line 335
    return-void
.end method

.method public final g(ZLhr8;)Ler8;
    .locals 3

    .line 1
    sget-object v0, Llt5;->x:Ljt5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljt5;->a:Lmt5;

    .line 7
    .line 8
    invoke-interface {v0}, Ler8;->s()Lgr8;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-interface {p2, v1, v2}, Lhr8;->a(Lgr8;I)Ll11;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-static {p2, v0}, Ll11;->q(Ll11;Ll11;)Lqd5;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :cond_0
    if-nez p2, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-virtual {p0, p2}, Llt5;->m(Ll11;)Ldr8;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lh53;

    .line 32
    .line 33
    new-instance p1, Lmt5;

    .line 34
    .line 35
    iget-object p0, p0, Lh53;->Y:Lk05;

    .line 36
    .line 37
    invoke-static {p0}, Lqd5;->c(Ll11;)Lqd5;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {p1, p0}, Lmt5;-><init>(Lqd5;)V

    .line 42
    .line 43
    .line 44
    return-object p1
.end method

.method public final l()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance p0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final m(Ll11;)Ldr8;
    .locals 1

    .line 1
    new-instance p0, Lh53;

    .line 2
    .line 3
    invoke-static {p1}, Lk05;->k(Ll11;)Lk05;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x2

    .line 8
    invoke-direct {p0, p1, v0}, Lh53;-><init>(Lk05;B)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhq8;->h()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "Preview:"

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final v(Laj0;Ldr8;)Ler8;
    .locals 1

    .line 1
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p1, Le63;->p:Lzx;

    .line 6
    .line 7
    const/16 v0, 0x22

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, p1, v0}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Ldr8;->d()Ler8;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final z(Ll11;)Liz;
    .locals 3

    .line 1
    iget-object v0, p0, Llt5;->s:Lb57;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lb57;->a(Ll11;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llt5;->s:Lb57;

    .line 7
    .line 8
    invoke-virtual {v0}, Lb57;->c()Lf57;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aget-object v0, v0, v2

    .line 24
    .line 25
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, Lhq8;->G(Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lhq8;->i:Liz;

    .line 39
    .line 40
    invoke-virtual {p0}, Liz;->b()Lxy0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iput-object p1, p0, Lxy0;->i0:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p0}, Lxy0;->b()Liz;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method
