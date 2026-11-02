.class public final Llr5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Llt4;
.implements Li04;
.implements Lbd6;
.implements Lk71;
.implements Ltx6;
.implements Lv17;
.implements Lrr6;
.implements Lxo2;
.implements Lvs;
.implements Lfa5;
.implements Lk5;
.implements Lrr8;
.implements Lxk;
.implements Lmu8;
.implements Lu4;


# instance fields
.field public final synthetic X:B

.field public Y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 1

    iput-byte p1, p0, Llr5;->X:B

    packed-switch p1, :pswitch_data_0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    new-instance p1, Lwl6;

    const/16 v0, 0x1a

    invoke-direct {p1, v0}, Lwl6;-><init>(B)V

    iput-object p1, p0, Llr5;->Y:Ljava/lang/Object;

    return-void

    .line 82
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    new-instance p1, Landroid/graphics/Region;

    invoke-direct {p1}, Landroid/graphics/Region;-><init>()V

    iput-object p1, p0, Llr5;->Y:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 95
    iput-byte p1, p0, Llr5;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 1

    const/16 v0, 0x1a

    iput-byte v0, p0, Llr5;->X:B

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    new-instance v0, Lte2;

    invoke-direct {v0, p1, p2}, Lte2;-><init>(FF)V

    iput-object v0, p0, Llr5;->Y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(FFLwk;)V
    .locals 1

    const/16 v0, 0x1b

    iput-byte v0, p0, Llr5;->X:B

    .line 73
    sget-object v0, Lku8;->a:[I

    if-nez p3, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    const v0, 0x44bb8000    # 1500.0f

    cmpg-float v0, p2, v0

    if-nez v0, :cond_0

    .line 74
    sget-object p1, Lgg1;->X:Lgg1;

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    .line 75
    new-instance v0, Lrb8;

    invoke-direct {v0, p1, p2, p3}, Lrb8;-><init>(FFLwk;)V

    move-object p1, v0

    goto :goto_0

    .line 76
    :cond_1
    new-instance p3, Llr5;

    invoke-direct {p3, p1, p2}, Llr5;-><init>(FF)V

    move-object p1, p3

    .line 77
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance p2, Lyr6;

    invoke-direct {p2, p1}, Lyr6;-><init>(Lxk;)V

    iput-object p2, p0, Llr5;->Y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    const/16 v0, 0xf

    iput-byte v0, p0, Llr5;->X:B

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 86
    new-instance v0, Lee7;

    .line 87
    invoke-direct {v0, p1}, Ly45;-><init>(Ljava/lang/Object;)V

    .line 88
    iput-object p1, v0, Lee7;->Y:Landroid/view/View;

    .line 89
    iput-object v0, p0, Llr5;->Y:Ljava/lang/Object;

    goto :goto_0

    .line 90
    :cond_0
    new-instance v0, Ly45;

    invoke-direct {v0, p1}, Ly45;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Llr5;->Y:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lax7;)V
    .locals 1

    const/16 v0, 0x13

    iput-byte v0, p0, Llr5;->X:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llr5;->Y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lik0;Lzh0;Lbh3;)V
    .locals 0

    const/16 p2, 0x19

    iput-byte p2, p0, Llr5;->X:B

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p1, p0, Llr5;->Y:Ljava/lang/Object;

    .line 93
    new-instance p1, Lv38;

    const/16 p2, 0x9

    invoke-direct {p1, p0, p2}, Lv38;-><init>(Ljava/lang/Object;B)V

    .line 94
    new-instance p0, Lvz7;

    invoke-direct {p0, p1}, Lvz7;-><init>(Ldn2;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 72
    iput-byte p2, p0, Llr5;->X:B

    iput-object p1, p0, Llr5;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>([J)V
    .locals 5

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    iput-byte v0, p0, Llr5;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_3

    .line 9
    .line 10
    array-length v0, p1

    .line 11
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, Lzz4;

    .line 16
    .line 17
    array-length v1, p1

    .line 18
    invoke-direct {v0, v1}, Lzz4;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iget v1, v0, Lzz4;->b:I

    .line 22
    .line 23
    if-ltz v1, :cond_2

    .line 24
    .line 25
    array-length v2, p1

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    array-length v2, p1

    .line 30
    add-int/2addr v2, v1

    .line 31
    invoke-virtual {v0, v2}, Lzz4;->c(I)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v0, Lzz4;->a:[J

    .line 35
    .line 36
    iget v3, v0, Lzz4;->b:I

    .line 37
    .line 38
    if-eq v1, v3, :cond_1

    .line 39
    .line 40
    array-length v4, p1

    .line 41
    add-int/2addr v4, v1

    .line 42
    invoke-static {v2, v2, v4, v1, v3}, Leu;->f0([J[JIII)V

    .line 43
    .line 44
    .line 45
    :cond_1
    array-length v3, p1

    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-static {p1, v2, v1, v4, v3}, Leu;->f0([J[JIII)V

    .line 48
    .line 49
    .line 50
    iget v1, v0, Lzz4;->b:I

    .line 51
    .line 52
    array-length p1, p1

    .line 53
    add-int/2addr v1, p1

    .line 54
    iput v1, v0, Lzz4;->b:I

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const-string p0, ""

    .line 58
    .line 59
    invoke-static {p0}, Lkp5;->k(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    throw p0

    .line 64
    :cond_3
    new-instance v0, Lzz4;

    .line 65
    .line 66
    invoke-direct {v0}, Lzz4;-><init>()V

    .line 67
    .line 68
    .line 69
    :goto_0
    iput-object v0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 70
    .line 71
    return-void
.end method

.method public static y(Ljava/lang/String;)Z
    .locals 7

    .line 1
    invoke-static {}, Lu15;->x()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    aget-object v4, v0, v2

    .line 11
    .line 12
    invoke-static {v4, p0}, Lpc6;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    new-instance v6, Ljava/io/File;

    .line 17
    .line 18
    invoke-direct {v6, v4, p0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    const-string v3, " binary detected!"

    .line 28
    .line 29
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lu15;->y()V

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return v3
.end method


# virtual methods
.method public A(Lwk;Lwk;Lwk;)Lwk;
    .locals 0

    .line 1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyr6;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lyr6;->A(Lwk;Lwk;Lwk;)Lwk;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public B(Ldq;)Lvj6;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, Llr5;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v1, v0

    .line 6
    check-cast v1, Lwl6;

    .line 7
    .line 8
    new-instance v0, Lyr2;

    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Ldq;->t()Lw50;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/16 v3, 0x1a

    .line 15
    .line 16
    invoke-direct {v0, v2, v3}, Lyr2;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lsa2;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v3, v2, v4}, Lsa2;-><init>(Lw50;B)V

    .line 23
    .line 24
    .line 25
    iget-object v5, v3, Lsa2;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v5, Ljava/util/ArrayList;

    .line 28
    .line 29
    iget v6, v2, Lw50;->Y:I

    .line 30
    .line 31
    iget v7, v2, Lw50;->X:I

    .line 32
    .line 33
    mul-int/lit8 v8, v6, 0x3

    .line 34
    .line 35
    div-int/lit16 v8, v8, 0x184

    .line 36
    .line 37
    const/4 v9, 0x3

    .line 38
    if-lt v8, v9, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v8, v9

    .line 42
    :goto_0
    const/4 v10, 0x5

    .line 43
    new-array v11, v10, [I

    .line 44
    .line 45
    add-int/lit8 v12, v8, -0x1

    .line 46
    .line 47
    move v13, v4

    .line 48
    :goto_1
    move/from16 p0, v10

    .line 49
    .line 50
    const/4 v10, 0x1

    .line 51
    const/4 v14, 0x4

    .line 52
    if-ge v12, v6, :cond_10

    .line 53
    .line 54
    if-nez v13, :cond_10

    .line 55
    .line 56
    invoke-static {v11, v4}, Ljava/util/Arrays;->fill([II)V

    .line 57
    .line 58
    .line 59
    move/from16 v16, v9

    .line 60
    .line 61
    move v9, v4

    .line 62
    :goto_2
    if-ge v9, v7, :cond_d

    .line 63
    .line 64
    invoke-virtual {v2, v9, v12}, Lw50;->b(II)Z

    .line 65
    .line 66
    .line 67
    move-result v18

    .line 68
    if-eqz v18, :cond_2

    .line 69
    .line 70
    and-int/lit8 v15, v4, 0x1

    .line 71
    .line 72
    if-ne v15, v10, :cond_1

    .line 73
    .line 74
    add-int/lit8 v4, v4, 0x1

    .line 75
    .line 76
    :cond_1
    aget v15, v11, v4

    .line 77
    .line 78
    add-int/2addr v15, v10

    .line 79
    aput v15, v11, v4

    .line 80
    .line 81
    move/from16 v20, v10

    .line 82
    .line 83
    move/from16 v19, v14

    .line 84
    .line 85
    goto/16 :goto_9

    .line 86
    .line 87
    :cond_2
    and-int/lit8 v15, v4, 0x1

    .line 88
    .line 89
    if-nez v15, :cond_c

    .line 90
    .line 91
    if-ne v4, v14, :cond_b

    .line 92
    .line 93
    invoke-static {v11}, Lsa2;->e([I)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_a

    .line 98
    .line 99
    invoke-virtual {v3, v12, v9, v11}, Lsa2;->f(II[I)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_9

    .line 104
    .line 105
    iget-boolean v4, v3, Lsa2;->b:Z

    .line 106
    .line 107
    if-eqz v4, :cond_4

    .line 108
    .line 109
    invoke-virtual {v3}, Lsa2;->g()Z

    .line 110
    .line 111
    .line 112
    move-result v13

    .line 113
    move/from16 v19, v14

    .line 114
    .line 115
    const/16 v18, 0x2

    .line 116
    .line 117
    :cond_3
    :goto_3
    const/4 v4, 0x0

    .line 118
    goto :goto_7

    .line 119
    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-gt v4, v10, :cond_5

    .line 124
    .line 125
    move/from16 v19, v14

    .line 126
    .line 127
    const/4 v4, 0x0

    .line 128
    const/16 v18, 0x2

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_5
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    const/4 v8, 0x0

    .line 136
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v15

    .line 140
    if-eqz v15, :cond_8

    .line 141
    .line 142
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v15

    .line 146
    check-cast v15, Lqa2;

    .line 147
    .line 148
    move/from16 v19, v14

    .line 149
    .line 150
    iget v14, v15, Lqa2;->d:I

    .line 151
    .line 152
    const/4 v10, 0x2

    .line 153
    if-lt v14, v10, :cond_7

    .line 154
    .line 155
    if-nez v8, :cond_6

    .line 156
    .line 157
    move-object v8, v15

    .line 158
    const/16 v18, 0x2

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_6
    const/4 v10, 0x1

    .line 162
    iput-boolean v10, v3, Lsa2;->b:Z

    .line 163
    .line 164
    iget v4, v8, Lxj6;->a:F

    .line 165
    .line 166
    iget v10, v15, Lxj6;->a:F

    .line 167
    .line 168
    sub-float/2addr v4, v10

    .line 169
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    iget v8, v8, Lxj6;->b:F

    .line 174
    .line 175
    iget v10, v15, Lxj6;->b:F

    .line 176
    .line 177
    sub-float/2addr v8, v10

    .line 178
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    sub-float/2addr v4, v8

    .line 183
    float-to-int v4, v4

    .line 184
    const/16 v18, 0x2

    .line 185
    .line 186
    div-int/lit8 v4, v4, 0x2

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_7
    move/from16 v18, v10

    .line 190
    .line 191
    :goto_5
    move/from16 v14, v19

    .line 192
    .line 193
    const/4 v10, 0x1

    .line 194
    goto :goto_4

    .line 195
    :cond_8
    move/from16 v19, v14

    .line 196
    .line 197
    const/16 v18, 0x2

    .line 198
    .line 199
    const/4 v4, 0x0

    .line 200
    :goto_6
    aget v8, v11, v18

    .line 201
    .line 202
    if-le v4, v8, :cond_3

    .line 203
    .line 204
    sub-int/2addr v4, v8

    .line 205
    add-int/lit8 v4, v4, -0x2

    .line 206
    .line 207
    add-int/2addr v12, v4

    .line 208
    add-int/lit8 v9, v7, -0x1

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :goto_7
    invoke-static {v11, v4}, Ljava/util/Arrays;->fill([II)V

    .line 212
    .line 213
    .line 214
    move/from16 v8, v18

    .line 215
    .line 216
    const/16 v20, 0x1

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_9
    move/from16 v19, v14

    .line 220
    .line 221
    const/4 v4, 0x0

    .line 222
    const/16 v18, 0x2

    .line 223
    .line 224
    aget v10, v11, v18

    .line 225
    .line 226
    aput v10, v11, v4

    .line 227
    .line 228
    aget v10, v11, v16

    .line 229
    .line 230
    const/16 v20, 0x1

    .line 231
    .line 232
    aput v10, v11, v20

    .line 233
    .line 234
    aget v10, v11, v19

    .line 235
    .line 236
    aput v10, v11, v18

    .line 237
    .line 238
    aput v20, v11, v16

    .line 239
    .line 240
    aput v4, v11, v19

    .line 241
    .line 242
    :goto_8
    move/from16 v4, v16

    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_a
    move/from16 v20, v10

    .line 246
    .line 247
    move/from16 v19, v14

    .line 248
    .line 249
    const/4 v4, 0x0

    .line 250
    const/16 v18, 0x2

    .line 251
    .line 252
    aget v10, v11, v18

    .line 253
    .line 254
    aput v10, v11, v4

    .line 255
    .line 256
    aget v10, v11, v16

    .line 257
    .line 258
    aput v10, v11, v20

    .line 259
    .line 260
    aget v10, v11, v19

    .line 261
    .line 262
    aput v10, v11, v18

    .line 263
    .line 264
    aput v20, v11, v16

    .line 265
    .line 266
    aput v4, v11, v19

    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_b
    move/from16 v20, v10

    .line 270
    .line 271
    move/from16 v19, v14

    .line 272
    .line 273
    add-int/lit8 v4, v4, 0x1

    .line 274
    .line 275
    aget v10, v11, v4

    .line 276
    .line 277
    add-int/lit8 v10, v10, 0x1

    .line 278
    .line 279
    aput v10, v11, v4

    .line 280
    .line 281
    goto :goto_9

    .line 282
    :cond_c
    move/from16 v20, v10

    .line 283
    .line 284
    move/from16 v19, v14

    .line 285
    .line 286
    aget v10, v11, v4

    .line 287
    .line 288
    add-int/lit8 v10, v10, 0x1

    .line 289
    .line 290
    aput v10, v11, v4

    .line 291
    .line 292
    :goto_9
    add-int/lit8 v9, v9, 0x1

    .line 293
    .line 294
    move/from16 v14, v19

    .line 295
    .line 296
    const/4 v10, 0x1

    .line 297
    goto/16 :goto_2

    .line 298
    .line 299
    :cond_d
    invoke-static {v11}, Lsa2;->e([I)Z

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    if-eqz v4, :cond_f

    .line 304
    .line 305
    invoke-virtual {v3, v12, v7, v11}, Lsa2;->f(II[I)Z

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    if-eqz v4, :cond_f

    .line 310
    .line 311
    const/16 v17, 0x0

    .line 312
    .line 313
    aget v4, v11, v17

    .line 314
    .line 315
    iget-boolean v8, v3, Lsa2;->b:Z

    .line 316
    .line 317
    if-eqz v8, :cond_e

    .line 318
    .line 319
    invoke-virtual {v3}, Lsa2;->g()Z

    .line 320
    .line 321
    .line 322
    move-result v8

    .line 323
    move v13, v8

    .line 324
    :cond_e
    move v8, v4

    .line 325
    :cond_f
    add-int/2addr v12, v8

    .line 326
    move/from16 v10, p0

    .line 327
    .line 328
    move/from16 v9, v16

    .line 329
    .line 330
    const/4 v4, 0x0

    .line 331
    goto/16 :goto_1

    .line 332
    .line 333
    :cond_10
    move/from16 v16, v9

    .line 334
    .line 335
    move/from16 v19, v14

    .line 336
    .line 337
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    move/from16 v4, v16

    .line 342
    .line 343
    if-lt v3, v4, :cond_47

    .line 344
    .line 345
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    :cond_11
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    if-eqz v4, :cond_12

    .line 354
    .line 355
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    check-cast v4, Lqa2;

    .line 360
    .line 361
    iget v4, v4, Lqa2;->d:I

    .line 362
    .line 363
    const/4 v10, 0x2

    .line 364
    if-ge v4, v10, :cond_11

    .line 365
    .line 366
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 367
    .line 368
    .line 369
    goto :goto_a

    .line 370
    :cond_12
    const/4 v10, 0x2

    .line 371
    sget-object v3, Lsa2;->e:Lra2;

    .line 372
    .line 373
    invoke-static {v5, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 374
    .line 375
    .line 376
    const/4 v4, 0x3

    .line 377
    new-array v3, v4, [Lqa2;

    .line 378
    .line 379
    const/4 v4, 0x0

    .line 380
    const-wide v11, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    :goto_b
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 386
    .line 387
    .line 388
    move-result v13

    .line 389
    sub-int/2addr v13, v10

    .line 390
    if-ge v4, v13, :cond_1c

    .line 391
    .line 392
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v10

    .line 396
    check-cast v10, Lqa2;

    .line 397
    .line 398
    iget v13, v10, Lqa2;->c:F

    .line 399
    .line 400
    add-int/lit8 v4, v4, 0x1

    .line 401
    .line 402
    move v14, v4

    .line 403
    :cond_13
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 404
    .line 405
    .line 406
    move-result v15

    .line 407
    const/16 v20, 0x1

    .line 408
    .line 409
    add-int/lit8 v15, v15, -0x1

    .line 410
    .line 411
    if-ge v14, v15, :cond_1b

    .line 412
    .line 413
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v15

    .line 417
    check-cast v15, Lqa2;

    .line 418
    .line 419
    invoke-static {v10, v15}, Lsa2;->m(Lqa2;Lqa2;)D

    .line 420
    .line 421
    .line 422
    move-result-wide v21

    .line 423
    add-int/lit8 v14, v14, 0x1

    .line 424
    .line 425
    move v8, v14

    .line 426
    const-wide v23, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    :goto_c
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 432
    .line 433
    .line 434
    move-result v9

    .line 435
    if-ge v8, v9, :cond_13

    .line 436
    .line 437
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v9

    .line 441
    check-cast v9, Lqa2;

    .line 442
    .line 443
    move-object/from16 v25, v3

    .line 444
    .line 445
    iget v3, v9, Lqa2;->c:F

    .line 446
    .line 447
    const v26, 0x3fb33333    # 1.4f

    .line 448
    .line 449
    .line 450
    mul-float v26, v26, v13

    .line 451
    .line 452
    cmpl-float v3, v3, v26

    .line 453
    .line 454
    if-lez v3, :cond_14

    .line 455
    .line 456
    goto/16 :goto_11

    .line 457
    .line 458
    :cond_14
    invoke-static {v15, v9}, Lsa2;->m(Lqa2;Lqa2;)D

    .line 459
    .line 460
    .line 461
    move-result-wide v26

    .line 462
    invoke-static {v10, v9}, Lsa2;->m(Lqa2;Lqa2;)D

    .line 463
    .line 464
    .line 465
    move-result-wide v28

    .line 466
    cmpg-double v3, v21, v26

    .line 467
    .line 468
    if-gez v3, :cond_17

    .line 469
    .line 470
    cmpl-double v3, v26, v28

    .line 471
    .line 472
    if-lez v3, :cond_16

    .line 473
    .line 474
    cmpg-double v3, v21, v28

    .line 475
    .line 476
    if-gez v3, :cond_15

    .line 477
    .line 478
    :goto_d
    move-wide/from16 v30, v21

    .line 479
    .line 480
    goto :goto_10

    .line 481
    :cond_15
    move-wide/from16 v30, v28

    .line 482
    .line 483
    :goto_e
    move-wide/from16 v28, v21

    .line 484
    .line 485
    goto :goto_10

    .line 486
    :cond_16
    move-wide/from16 v30, v28

    .line 487
    .line 488
    move-wide/from16 v28, v26

    .line 489
    .line 490
    move-wide/from16 v26, v30

    .line 491
    .line 492
    goto :goto_d

    .line 493
    :cond_17
    cmpg-double v3, v26, v28

    .line 494
    .line 495
    if-gez v3, :cond_19

    .line 496
    .line 497
    cmpg-double v3, v21, v28

    .line 498
    .line 499
    if-gez v3, :cond_18

    .line 500
    .line 501
    move-wide/from16 v30, v26

    .line 502
    .line 503
    move-wide/from16 v26, v28

    .line 504
    .line 505
    goto :goto_e

    .line 506
    :cond_18
    move-wide/from16 v30, v26

    .line 507
    .line 508
    :goto_f
    move-wide/from16 v26, v21

    .line 509
    .line 510
    goto :goto_10

    .line 511
    :cond_19
    move-wide/from16 v30, v28

    .line 512
    .line 513
    move-wide/from16 v28, v26

    .line 514
    .line 515
    goto :goto_f

    .line 516
    :goto_10
    const-wide/high16 v32, 0x4000000000000000L    # 2.0

    .line 517
    .line 518
    mul-double v28, v28, v32

    .line 519
    .line 520
    sub-double v28, v26, v28

    .line 521
    .line 522
    invoke-static/range {v28 .. v29}, Ljava/lang/Math;->abs(D)D

    .line 523
    .line 524
    .line 525
    move-result-wide v28

    .line 526
    mul-double v30, v30, v32

    .line 527
    .line 528
    sub-double v26, v26, v30

    .line 529
    .line 530
    invoke-static/range {v26 .. v27}, Ljava/lang/Math;->abs(D)D

    .line 531
    .line 532
    .line 533
    move-result-wide v26

    .line 534
    add-double v26, v26, v28

    .line 535
    .line 536
    cmpg-double v3, v26, v11

    .line 537
    .line 538
    if-gez v3, :cond_1a

    .line 539
    .line 540
    const/16 v17, 0x0

    .line 541
    .line 542
    aput-object v10, v25, v17

    .line 543
    .line 544
    const/16 v20, 0x1

    .line 545
    .line 546
    aput-object v15, v25, v20

    .line 547
    .line 548
    const/16 v18, 0x2

    .line 549
    .line 550
    aput-object v9, v25, v18

    .line 551
    .line 552
    move-wide/from16 v11, v26

    .line 553
    .line 554
    :cond_1a
    :goto_11
    add-int/lit8 v8, v8, 0x1

    .line 555
    .line 556
    move-object/from16 v3, v25

    .line 557
    .line 558
    goto :goto_c

    .line 559
    :cond_1b
    const/4 v10, 0x2

    .line 560
    goto/16 :goto_b

    .line 561
    .line 562
    :cond_1c
    move-object/from16 v25, v3

    .line 563
    .line 564
    const-wide v23, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    cmpl-double v3, v11, v23

    .line 570
    .line 571
    if-eqz v3, :cond_46

    .line 572
    .line 573
    const/16 v17, 0x0

    .line 574
    .line 575
    aget-object v3, v25, v17

    .line 576
    .line 577
    const/16 v20, 0x1

    .line 578
    .line 579
    aget-object v4, v25, v20

    .line 580
    .line 581
    invoke-static {v3, v4}, Lxj6;->a(Lxj6;Lxj6;)F

    .line 582
    .line 583
    .line 584
    move-result v3

    .line 585
    aget-object v4, v25, v20

    .line 586
    .line 587
    const/16 v18, 0x2

    .line 588
    .line 589
    aget-object v5, v25, v18

    .line 590
    .line 591
    invoke-static {v4, v5}, Lxj6;->a(Lxj6;Lxj6;)F

    .line 592
    .line 593
    .line 594
    move-result v4

    .line 595
    aget-object v5, v25, v17

    .line 596
    .line 597
    aget-object v8, v25, v18

    .line 598
    .line 599
    invoke-static {v5, v8}, Lxj6;->a(Lxj6;Lxj6;)F

    .line 600
    .line 601
    .line 602
    move-result v5

    .line 603
    cmpl-float v8, v4, v3

    .line 604
    .line 605
    if-ltz v8, :cond_1d

    .line 606
    .line 607
    cmpl-float v8, v4, v5

    .line 608
    .line 609
    if-ltz v8, :cond_1d

    .line 610
    .line 611
    aget-object v3, v25, v17

    .line 612
    .line 613
    aget-object v4, v25, v20

    .line 614
    .line 615
    aget-object v5, v25, v18

    .line 616
    .line 617
    goto :goto_12

    .line 618
    :cond_1d
    cmpl-float v4, v5, v4

    .line 619
    .line 620
    if-ltz v4, :cond_1e

    .line 621
    .line 622
    cmpl-float v3, v5, v3

    .line 623
    .line 624
    if-ltz v3, :cond_1e

    .line 625
    .line 626
    aget-object v3, v25, v20

    .line 627
    .line 628
    aget-object v4, v25, v17

    .line 629
    .line 630
    aget-object v5, v25, v18

    .line 631
    .line 632
    goto :goto_12

    .line 633
    :cond_1e
    aget-object v3, v25, v18

    .line 634
    .line 635
    aget-object v4, v25, v17

    .line 636
    .line 637
    aget-object v5, v25, v20

    .line 638
    .line 639
    :goto_12
    iget v8, v3, Lxj6;->a:F

    .line 640
    .line 641
    iget v9, v3, Lxj6;->b:F

    .line 642
    .line 643
    iget v10, v5, Lxj6;->a:F

    .line 644
    .line 645
    sub-float/2addr v10, v8

    .line 646
    iget v11, v4, Lxj6;->b:F

    .line 647
    .line 648
    sub-float/2addr v11, v9

    .line 649
    mul-float/2addr v11, v10

    .line 650
    iget v10, v5, Lxj6;->b:F

    .line 651
    .line 652
    sub-float/2addr v10, v9

    .line 653
    iget v12, v4, Lxj6;->a:F

    .line 654
    .line 655
    sub-float/2addr v12, v8

    .line 656
    mul-float/2addr v12, v10

    .line 657
    sub-float/2addr v11, v12

    .line 658
    const/4 v8, 0x0

    .line 659
    cmpg-float v10, v11, v8

    .line 660
    .line 661
    if-gez v10, :cond_1f

    .line 662
    .line 663
    move-object/from16 v17, v5

    .line 664
    .line 665
    move-object v5, v4

    .line 666
    move-object/from16 v4, v17

    .line 667
    .line 668
    :cond_1f
    const/16 v17, 0x0

    .line 669
    .line 670
    aput-object v4, v25, v17

    .line 671
    .line 672
    const/16 v20, 0x1

    .line 673
    .line 674
    aput-object v3, v25, v20

    .line 675
    .line 676
    const/16 v18, 0x2

    .line 677
    .line 678
    aput-object v5, v25, v18

    .line 679
    .line 680
    invoke-virtual {v0, v3, v5}, Lyr2;->h(Lqa2;Lqa2;)F

    .line 681
    .line 682
    .line 683
    move-result v10

    .line 684
    iget v11, v3, Lxj6;->a:F

    .line 685
    .line 686
    iget v12, v5, Lxj6;->b:F

    .line 687
    .line 688
    iget v13, v5, Lxj6;->a:F

    .line 689
    .line 690
    invoke-virtual {v0, v3, v4}, Lyr2;->h(Lqa2;Lqa2;)F

    .line 691
    .line 692
    .line 693
    move-result v14

    .line 694
    iget v15, v4, Lxj6;->b:F

    .line 695
    .line 696
    move/from16 v21, v8

    .line 697
    .line 698
    iget v8, v4, Lxj6;->a:F

    .line 699
    .line 700
    add-float/2addr v14, v10

    .line 701
    const/high16 v10, 0x40000000    # 2.0f

    .line 702
    .line 703
    div-float/2addr v14, v10

    .line 704
    const/high16 v10, 0x3f800000    # 1.0f

    .line 705
    .line 706
    cmpg-float v22, v14, v10

    .line 707
    .line 708
    if-ltz v22, :cond_45

    .line 709
    .line 710
    invoke-static {v3, v5}, Lxj6;->a(Lxj6;Lxj6;)F

    .line 711
    .line 712
    .line 713
    move-result v22

    .line 714
    div-float v22, v22, v14

    .line 715
    .line 716
    cmpg-float v23, v22, v21

    .line 717
    .line 718
    const/high16 v24, -0x41000000    # -0.5f

    .line 719
    .line 720
    const/high16 v25, 0x3f000000    # 0.5f

    .line 721
    .line 722
    if-gez v23, :cond_20

    .line 723
    .line 724
    move/from16 v23, v24

    .line 725
    .line 726
    :goto_13
    move/from16 v26, v10

    .line 727
    .line 728
    goto :goto_14

    .line 729
    :cond_20
    move/from16 v23, v25

    .line 730
    .line 731
    goto :goto_13

    .line 732
    :goto_14
    add-float v10, v22, v23

    .line 733
    .line 734
    float-to-int v10, v10

    .line 735
    invoke-static {v3, v4}, Lxj6;->a(Lxj6;Lxj6;)F

    .line 736
    .line 737
    .line 738
    move-result v22

    .line 739
    div-float v22, v22, v14

    .line 740
    .line 741
    cmpg-float v23, v22, v21

    .line 742
    .line 743
    if-gez v23, :cond_21

    .line 744
    .line 745
    :goto_15
    move/from16 v23, v8

    .line 746
    .line 747
    goto :goto_16

    .line 748
    :cond_21
    move/from16 v24, v25

    .line 749
    .line 750
    goto :goto_15

    .line 751
    :goto_16
    add-float v8, v22, v24

    .line 752
    .line 753
    float-to-int v8, v8

    .line 754
    add-int/2addr v8, v10

    .line 755
    const/4 v10, 0x2

    .line 756
    div-int/2addr v8, v10

    .line 757
    add-int/lit8 v22, v8, 0x7

    .line 758
    .line 759
    move/from16 v24, v8

    .line 760
    .line 761
    and-int/lit8 v8, v22, 0x3

    .line 762
    .line 763
    if-eqz v8, :cond_24

    .line 764
    .line 765
    if-eq v8, v10, :cond_23

    .line 766
    .line 767
    const/4 v10, 0x3

    .line 768
    if-eq v8, v10, :cond_22

    .line 769
    .line 770
    :goto_17
    move/from16 v8, v22

    .line 771
    .line 772
    goto :goto_18

    .line 773
    :cond_22
    add-int/lit8 v22, v24, 0x5

    .line 774
    .line 775
    goto :goto_17

    .line 776
    :cond_23
    add-int/lit8 v22, v24, 0x6

    .line 777
    .line 778
    goto :goto_17

    .line 779
    :cond_24
    add-int/lit8 v22, v24, 0x8

    .line 780
    .line 781
    goto :goto_17

    .line 782
    :goto_18
    sget-object v10, Lav8;->e:[I

    .line 783
    .line 784
    rem-int/lit8 v10, v8, 0x4

    .line 785
    .line 786
    move/from16 v22, v12

    .line 787
    .line 788
    const/4 v12, 0x1

    .line 789
    if-ne v10, v12, :cond_44

    .line 790
    .line 791
    add-int/lit8 v10, v8, -0x11

    .line 792
    .line 793
    :try_start_0
    div-int/lit8 v10, v10, 0x4

    .line 794
    .line 795
    invoke-static {v10}, Lav8;->c(I)Lav8;

    .line 796
    .line 797
    .line 798
    move-result-object v10
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_5

    .line 799
    iget-byte v12, v10, Lav8;->a:B

    .line 800
    .line 801
    mul-int/lit8 v12, v12, 0x4

    .line 802
    .line 803
    add-int/lit8 v12, v12, 0xa

    .line 804
    .line 805
    iget-object v10, v10, Lav8;->b:[I

    .line 806
    .line 807
    array-length v10, v10

    .line 808
    const/high16 v24, 0x40400000    # 3.0f

    .line 809
    .line 810
    if-lez v10, :cond_25

    .line 811
    .line 812
    sub-float v10, v13, v11

    .line 813
    .line 814
    add-float v10, v10, v23

    .line 815
    .line 816
    sub-float v27, v22, v9

    .line 817
    .line 818
    move/from16 v28, v13

    .line 819
    .line 820
    add-float v13, v27, v15

    .line 821
    .line 822
    int-to-float v12, v12

    .line 823
    div-float v12, v24, v12

    .line 824
    .line 825
    sub-float v12, v26, v12

    .line 826
    .line 827
    invoke-static {v10, v11, v12, v11}, Lp61;->e(FFFF)F

    .line 828
    .line 829
    .line 830
    move-result v10

    .line 831
    float-to-int v10, v10

    .line 832
    invoke-static {v13, v9, v12, v9}, Lp61;->e(FFFF)F

    .line 833
    .line 834
    .line 835
    move-result v12

    .line 836
    float-to-int v12, v12

    .line 837
    move/from16 v26, v9

    .line 838
    .line 839
    move/from16 v13, v19

    .line 840
    .line 841
    :goto_19
    const/16 v9, 0x10

    .line 842
    .line 843
    if-gt v13, v9, :cond_26

    .line 844
    .line 845
    int-to-float v9, v13

    .line 846
    :try_start_1
    invoke-virtual {v0, v14, v9, v10, v12}, Lyr2;->m(FFII)Lw8;

    .line 847
    .line 848
    .line 849
    move-result-object v0
    :try_end_1
    .catch Lf65; {:try_start_1 .. :try_end_1} :catch_0

    .line 850
    goto :goto_1a

    .line 851
    :catch_0
    shl-int/lit8 v13, v13, 0x1

    .line 852
    .line 853
    goto :goto_19

    .line 854
    :cond_25
    move/from16 v26, v9

    .line 855
    .line 856
    move/from16 v28, v13

    .line 857
    .line 858
    :cond_26
    const/4 v0, 0x0

    .line 859
    :goto_1a
    int-to-float v9, v8

    .line 860
    const/high16 v10, 0x40600000    # 3.5f

    .line 861
    .line 862
    sub-float v31, v9, v10

    .line 863
    .line 864
    if-eqz v0, :cond_27

    .line 865
    .line 866
    iget v9, v0, Lxj6;->a:F

    .line 867
    .line 868
    iget v10, v0, Lxj6;->b:F

    .line 869
    .line 870
    sub-float v11, v31, v24

    .line 871
    .line 872
    move/from16 v33, v11

    .line 873
    .line 874
    :goto_1b
    move/from16 v37, v10

    .line 875
    .line 876
    goto :goto_1c

    .line 877
    :cond_27
    sub-float v13, v28, v11

    .line 878
    .line 879
    add-float v9, v13, v23

    .line 880
    .line 881
    sub-float v12, v22, v26

    .line 882
    .line 883
    add-float v10, v12, v15

    .line 884
    .line 885
    move/from16 v33, v31

    .line 886
    .line 887
    goto :goto_1b

    .line 888
    :goto_1c
    iget v10, v3, Lxj6;->a:F

    .line 889
    .line 890
    iget v11, v3, Lxj6;->b:F

    .line 891
    .line 892
    iget v12, v5, Lxj6;->a:F

    .line 893
    .line 894
    iget v13, v5, Lxj6;->b:F

    .line 895
    .line 896
    iget v14, v4, Lxj6;->a:F

    .line 897
    .line 898
    iget v15, v4, Lxj6;->b:F

    .line 899
    .line 900
    const/high16 v29, 0x40600000    # 3.5f

    .line 901
    .line 902
    const/high16 v30, 0x40600000    # 3.5f

    .line 903
    .line 904
    const/high16 v32, 0x40600000    # 3.5f

    .line 905
    .line 906
    const/high16 v35, 0x40600000    # 3.5f

    .line 907
    .line 908
    move/from16 v34, v33

    .line 909
    .line 910
    move/from16 v36, v31

    .line 911
    .line 912
    move-object/from16 p0, v0

    .line 913
    .line 914
    invoke-static/range {v29 .. v36}, Lwm5;->a(FFFFFFFF)Lwm5;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    move-object/from16 v22, v3

    .line 919
    .line 920
    iget v3, v0, Lwm5;->e:F

    .line 921
    .line 922
    move/from16 v23, v3

    .line 923
    .line 924
    iget v3, v0, Lwm5;->i:F

    .line 925
    .line 926
    mul-float v24, v23, v3

    .line 927
    .line 928
    move/from16 v26, v3

    .line 929
    .line 930
    iget v3, v0, Lwm5;->f:F

    .line 931
    .line 932
    move/from16 v27, v3

    .line 933
    .line 934
    iget v3, v0, Lwm5;->h:F

    .line 935
    .line 936
    mul-float v28, v27, v3

    .line 937
    .line 938
    sub-float v24, v24, v28

    .line 939
    .line 940
    move/from16 v28, v3

    .line 941
    .line 942
    iget v3, v0, Lwm5;->g:F

    .line 943
    .line 944
    mul-float v29, v27, v3

    .line 945
    .line 946
    move/from16 v30, v3

    .line 947
    .line 948
    iget v3, v0, Lwm5;->d:F

    .line 949
    .line 950
    mul-float v31, v3, v26

    .line 951
    .line 952
    sub-float v29, v29, v31

    .line 953
    .line 954
    mul-float v31, v3, v28

    .line 955
    .line 956
    mul-float v32, v23, v30

    .line 957
    .line 958
    sub-float v31, v31, v32

    .line 959
    .line 960
    move/from16 v32, v3

    .line 961
    .line 962
    iget v3, v0, Lwm5;->c:F

    .line 963
    .line 964
    mul-float v33, v3, v28

    .line 965
    .line 966
    move/from16 v34, v3

    .line 967
    .line 968
    iget v3, v0, Lwm5;->b:F

    .line 969
    .line 970
    mul-float v35, v3, v26

    .line 971
    .line 972
    sub-float v40, v33, v35

    .line 973
    .line 974
    iget v0, v0, Lwm5;->a:F

    .line 975
    .line 976
    mul-float v26, v26, v0

    .line 977
    .line 978
    mul-float v33, v34, v30

    .line 979
    .line 980
    sub-float v26, v26, v33

    .line 981
    .line 982
    mul-float v30, v30, v3

    .line 983
    .line 984
    mul-float v28, v28, v0

    .line 985
    .line 986
    sub-float v30, v30, v28

    .line 987
    .line 988
    mul-float v28, v3, v27

    .line 989
    .line 990
    mul-float v33, v34, v23

    .line 991
    .line 992
    sub-float v28, v28, v33

    .line 993
    .line 994
    mul-float v33, v34, v32

    .line 995
    .line 996
    mul-float v27, v27, v0

    .line 997
    .line 998
    sub-float v27, v33, v27

    .line 999
    .line 1000
    mul-float v0, v0, v23

    .line 1001
    .line 1002
    mul-float v3, v3, v32

    .line 1003
    .line 1004
    sub-float/2addr v0, v3

    .line 1005
    move/from16 v36, v9

    .line 1006
    .line 1007
    move/from16 v32, v10

    .line 1008
    .line 1009
    move/from16 v33, v11

    .line 1010
    .line 1011
    move/from16 v34, v12

    .line 1012
    .line 1013
    move/from16 v35, v13

    .line 1014
    .line 1015
    move/from16 v38, v14

    .line 1016
    .line 1017
    move/from16 v39, v15

    .line 1018
    .line 1019
    invoke-static/range {v32 .. v39}, Lwm5;->a(FFFFFFFF)Lwm5;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v3

    .line 1023
    iget v9, v3, Lwm5;->a:F

    .line 1024
    .line 1025
    mul-float v10, v9, v24

    .line 1026
    .line 1027
    iget v11, v3, Lwm5;->d:F

    .line 1028
    .line 1029
    mul-float v12, v11, v40

    .line 1030
    .line 1031
    add-float/2addr v12, v10

    .line 1032
    iget v10, v3, Lwm5;->g:F

    .line 1033
    .line 1034
    mul-float v13, v10, v28

    .line 1035
    .line 1036
    add-float/2addr v13, v12

    .line 1037
    mul-float v12, v9, v29

    .line 1038
    .line 1039
    mul-float v14, v11, v26

    .line 1040
    .line 1041
    add-float/2addr v14, v12

    .line 1042
    mul-float v12, v10, v27

    .line 1043
    .line 1044
    add-float/2addr v12, v14

    .line 1045
    mul-float v9, v9, v31

    .line 1046
    .line 1047
    mul-float v11, v11, v30

    .line 1048
    .line 1049
    add-float/2addr v11, v9

    .line 1050
    mul-float/2addr v10, v0

    .line 1051
    add-float/2addr v10, v11

    .line 1052
    iget v9, v3, Lwm5;->b:F

    .line 1053
    .line 1054
    mul-float v11, v9, v24

    .line 1055
    .line 1056
    iget v14, v3, Lwm5;->e:F

    .line 1057
    .line 1058
    mul-float v15, v14, v40

    .line 1059
    .line 1060
    add-float/2addr v15, v11

    .line 1061
    iget v11, v3, Lwm5;->h:F

    .line 1062
    .line 1063
    mul-float v23, v11, v28

    .line 1064
    .line 1065
    add-float v23, v23, v15

    .line 1066
    .line 1067
    mul-float v15, v9, v29

    .line 1068
    .line 1069
    mul-float v32, v14, v26

    .line 1070
    .line 1071
    add-float v32, v32, v15

    .line 1072
    .line 1073
    mul-float v15, v11, v27

    .line 1074
    .line 1075
    add-float v15, v15, v32

    .line 1076
    .line 1077
    mul-float v9, v9, v31

    .line 1078
    .line 1079
    mul-float v14, v14, v30

    .line 1080
    .line 1081
    add-float/2addr v14, v9

    .line 1082
    mul-float/2addr v11, v0

    .line 1083
    add-float/2addr v11, v14

    .line 1084
    iget v9, v3, Lwm5;->c:F

    .line 1085
    .line 1086
    mul-float v24, v24, v9

    .line 1087
    .line 1088
    iget v14, v3, Lwm5;->f:F

    .line 1089
    .line 1090
    mul-float v40, v40, v14

    .line 1091
    .line 1092
    add-float v40, v40, v24

    .line 1093
    .line 1094
    iget v3, v3, Lwm5;->i:F

    .line 1095
    .line 1096
    mul-float v28, v28, v3

    .line 1097
    .line 1098
    add-float v28, v28, v40

    .line 1099
    .line 1100
    mul-float v29, v29, v9

    .line 1101
    .line 1102
    mul-float v26, v26, v14

    .line 1103
    .line 1104
    add-float v26, v26, v29

    .line 1105
    .line 1106
    mul-float v27, v27, v3

    .line 1107
    .line 1108
    add-float v27, v27, v26

    .line 1109
    .line 1110
    mul-float v9, v9, v31

    .line 1111
    .line 1112
    mul-float v14, v14, v30

    .line 1113
    .line 1114
    add-float/2addr v14, v9

    .line 1115
    mul-float/2addr v3, v0

    .line 1116
    add-float/2addr v3, v14

    .line 1117
    if-lez v8, :cond_43

    .line 1118
    .line 1119
    if-lez v8, :cond_43

    .line 1120
    .line 1121
    new-instance v0, Lw50;

    .line 1122
    .line 1123
    invoke-direct {v0, v8, v8}, Lw50;-><init>(II)V

    .line 1124
    .line 1125
    .line 1126
    mul-int/lit8 v9, v8, 0x2

    .line 1127
    .line 1128
    new-array v14, v9, [F

    .line 1129
    .line 1130
    move/from16 v24, v3

    .line 1131
    .line 1132
    const/4 v3, 0x0

    .line 1133
    :goto_1d
    if-ge v3, v8, :cond_38

    .line 1134
    .line 1135
    move-object/from16 v26, v4

    .line 1136
    .line 1137
    int-to-float v4, v3

    .line 1138
    add-float v4, v4, v25

    .line 1139
    .line 1140
    move/from16 v29, v3

    .line 1141
    .line 1142
    const/4 v3, 0x0

    .line 1143
    :goto_1e
    if-ge v3, v9, :cond_28

    .line 1144
    .line 1145
    move/from16 v30, v3

    .line 1146
    .line 1147
    div-int/lit8 v3, v30, 0x2

    .line 1148
    .line 1149
    int-to-float v3, v3

    .line 1150
    add-float v3, v3, v25

    .line 1151
    .line 1152
    aput v3, v14, v30

    .line 1153
    .line 1154
    add-int/lit8 v3, v30, 0x1

    .line 1155
    .line 1156
    aput v4, v14, v3

    .line 1157
    .line 1158
    add-int/lit8 v3, v30, 0x2

    .line 1159
    .line 1160
    goto :goto_1e

    .line 1161
    :cond_28
    add-int/lit8 v3, v9, -0x1

    .line 1162
    .line 1163
    const/4 v4, 0x0

    .line 1164
    :goto_1f
    if-ge v4, v3, :cond_29

    .line 1165
    .line 1166
    aget v30, v14, v4

    .line 1167
    .line 1168
    add-int/lit8 v31, v4, 0x1

    .line 1169
    .line 1170
    aget v32, v14, v31

    .line 1171
    .line 1172
    mul-float v33, v28, v30

    .line 1173
    .line 1174
    mul-float v34, v27, v32

    .line 1175
    .line 1176
    add-float v34, v34, v33

    .line 1177
    .line 1178
    add-float v34, v34, v24

    .line 1179
    .line 1180
    mul-float v33, v13, v30

    .line 1181
    .line 1182
    mul-float v35, v12, v32

    .line 1183
    .line 1184
    add-float v35, v35, v33

    .line 1185
    .line 1186
    add-float v35, v35, v10

    .line 1187
    .line 1188
    div-float v35, v35, v34

    .line 1189
    .line 1190
    aput v35, v14, v4

    .line 1191
    .line 1192
    mul-float v30, v30, v23

    .line 1193
    .line 1194
    mul-float v32, v32, v15

    .line 1195
    .line 1196
    add-float v32, v32, v30

    .line 1197
    .line 1198
    add-float v32, v32, v11

    .line 1199
    .line 1200
    div-float v32, v32, v34

    .line 1201
    .line 1202
    aput v32, v14, v31

    .line 1203
    .line 1204
    add-int/lit8 v4, v4, 0x2

    .line 1205
    .line 1206
    goto :goto_1f

    .line 1207
    :cond_29
    move-object/from16 v31, v5

    .line 1208
    .line 1209
    const/4 v4, 0x0

    .line 1210
    const/16 v30, 0x1

    .line 1211
    .line 1212
    :goto_20
    if-ge v4, v3, :cond_2f

    .line 1213
    .line 1214
    if-eqz v30, :cond_2f

    .line 1215
    .line 1216
    aget v5, v14, v4

    .line 1217
    .line 1218
    float-to-int v5, v5

    .line 1219
    add-int/lit8 v32, v4, 0x1

    .line 1220
    .line 1221
    move/from16 v33, v3

    .line 1222
    .line 1223
    aget v3, v14, v32

    .line 1224
    .line 1225
    float-to-int v3, v3

    .line 1226
    move/from16 v34, v4

    .line 1227
    .line 1228
    const/4 v4, -0x1

    .line 1229
    if-lt v5, v4, :cond_2e

    .line 1230
    .line 1231
    if-gt v5, v7, :cond_2e

    .line 1232
    .line 1233
    if-lt v3, v4, :cond_2e

    .line 1234
    .line 1235
    if-gt v3, v6, :cond_2e

    .line 1236
    .line 1237
    if-ne v5, v4, :cond_2a

    .line 1238
    .line 1239
    aput v21, v14, v34

    .line 1240
    .line 1241
    :goto_21
    const/4 v5, 0x1

    .line 1242
    goto :goto_22

    .line 1243
    :cond_2a
    if-ne v5, v7, :cond_2b

    .line 1244
    .line 1245
    add-int/lit8 v5, v7, -0x1

    .line 1246
    .line 1247
    int-to-float v5, v5

    .line 1248
    aput v5, v14, v34

    .line 1249
    .line 1250
    goto :goto_21

    .line 1251
    :cond_2b
    const/4 v5, 0x0

    .line 1252
    :goto_22
    if-ne v3, v4, :cond_2c

    .line 1253
    .line 1254
    aput v21, v14, v32

    .line 1255
    .line 1256
    :goto_23
    const/16 v30, 0x1

    .line 1257
    .line 1258
    goto :goto_24

    .line 1259
    :cond_2c
    if-ne v3, v6, :cond_2d

    .line 1260
    .line 1261
    add-int/lit8 v3, v6, -0x1

    .line 1262
    .line 1263
    int-to-float v3, v3

    .line 1264
    aput v3, v14, v32

    .line 1265
    .line 1266
    goto :goto_23

    .line 1267
    :cond_2d
    move/from16 v30, v5

    .line 1268
    .line 1269
    :goto_24
    add-int/lit8 v4, v34, 0x2

    .line 1270
    .line 1271
    move/from16 v3, v33

    .line 1272
    .line 1273
    goto :goto_20

    .line 1274
    :cond_2e
    invoke-static {}, Lf65;->a()Lf65;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v0

    .line 1278
    throw v0

    .line 1279
    :cond_2f
    add-int/lit8 v3, v9, -0x2

    .line 1280
    .line 1281
    const/4 v4, 0x1

    .line 1282
    :goto_25
    if-ltz v3, :cond_35

    .line 1283
    .line 1284
    if-eqz v4, :cond_35

    .line 1285
    .line 1286
    aget v4, v14, v3

    .line 1287
    .line 1288
    float-to-int v4, v4

    .line 1289
    add-int/lit8 v5, v3, 0x1

    .line 1290
    .line 1291
    move/from16 v32, v3

    .line 1292
    .line 1293
    aget v3, v14, v5

    .line 1294
    .line 1295
    float-to-int v3, v3

    .line 1296
    move/from16 v33, v5

    .line 1297
    .line 1298
    const/4 v5, -0x1

    .line 1299
    if-lt v4, v5, :cond_34

    .line 1300
    .line 1301
    if-gt v4, v7, :cond_34

    .line 1302
    .line 1303
    if-lt v3, v5, :cond_34

    .line 1304
    .line 1305
    if-gt v3, v6, :cond_34

    .line 1306
    .line 1307
    if-ne v4, v5, :cond_30

    .line 1308
    .line 1309
    aput v21, v14, v32

    .line 1310
    .line 1311
    :goto_26
    const/4 v4, 0x1

    .line 1312
    goto :goto_27

    .line 1313
    :cond_30
    if-ne v4, v7, :cond_31

    .line 1314
    .line 1315
    add-int/lit8 v4, v7, -0x1

    .line 1316
    .line 1317
    int-to-float v4, v4

    .line 1318
    aput v4, v14, v32

    .line 1319
    .line 1320
    goto :goto_26

    .line 1321
    :cond_31
    const/4 v4, 0x0

    .line 1322
    :goto_27
    if-ne v3, v5, :cond_32

    .line 1323
    .line 1324
    aput v21, v14, v33

    .line 1325
    .line 1326
    :goto_28
    const/4 v4, 0x1

    .line 1327
    goto :goto_29

    .line 1328
    :cond_32
    if-ne v3, v6, :cond_33

    .line 1329
    .line 1330
    add-int/lit8 v3, v6, -0x1

    .line 1331
    .line 1332
    int-to-float v3, v3

    .line 1333
    aput v3, v14, v33

    .line 1334
    .line 1335
    goto :goto_28

    .line 1336
    :cond_33
    :goto_29
    add-int/lit8 v3, v32, -0x2

    .line 1337
    .line 1338
    goto :goto_25

    .line 1339
    :cond_34
    invoke-static {}, Lf65;->a()Lf65;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v0

    .line 1343
    throw v0

    .line 1344
    :cond_35
    const/4 v3, 0x0

    .line 1345
    :goto_2a
    if-ge v3, v9, :cond_37

    .line 1346
    .line 1347
    :try_start_2
    aget v4, v14, v3

    .line 1348
    .line 1349
    float-to-int v4, v4

    .line 1350
    add-int/lit8 v5, v3, 0x1

    .line 1351
    .line 1352
    aget v5, v14, v5

    .line 1353
    .line 1354
    float-to-int v5, v5

    .line 1355
    invoke-virtual {v2, v4, v5}, Lw50;->b(II)Z

    .line 1356
    .line 1357
    .line 1358
    move-result v4

    .line 1359
    if-eqz v4, :cond_36

    .line 1360
    .line 1361
    div-int/lit8 v4, v3, 0x2

    .line 1362
    .line 1363
    iget v5, v0, Lw50;->Z:I

    .line 1364
    .line 1365
    mul-int v5, v5, v29

    .line 1366
    .line 1367
    div-int/lit8 v30, v4, 0x20

    .line 1368
    .line 1369
    add-int v30, v30, v5

    .line 1370
    .line 1371
    iget-object v5, v0, Lw50;->f0:[I

    .line 1372
    .line 1373
    aget v32, v5, v30

    .line 1374
    .line 1375
    and-int/lit8 v4, v4, 0x1f

    .line 1376
    .line 1377
    const/16 v20, 0x1

    .line 1378
    .line 1379
    shl-int v4, v20, v4

    .line 1380
    .line 1381
    or-int v4, v32, v4

    .line 1382
    .line 1383
    aput v4, v5, v30
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    .line 1384
    .line 1385
    :cond_36
    add-int/lit8 v3, v3, 0x2

    .line 1386
    .line 1387
    goto :goto_2a

    .line 1388
    :catch_1
    invoke-static {}, Lf65;->a()Lf65;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v0

    .line 1392
    throw v0

    .line 1393
    :cond_37
    add-int/lit8 v3, v29, 0x1

    .line 1394
    .line 1395
    move-object/from16 v4, v26

    .line 1396
    .line 1397
    move-object/from16 v5, v31

    .line 1398
    .line 1399
    goto/16 :goto_1d

    .line 1400
    .line 1401
    :cond_38
    move-object/from16 v26, v4

    .line 1402
    .line 1403
    move-object/from16 v31, v5

    .line 1404
    .line 1405
    if-nez p0, :cond_39

    .line 1406
    .line 1407
    const/4 v4, 0x3

    .line 1408
    new-array v2, v4, [Lxj6;

    .line 1409
    .line 1410
    const/16 v17, 0x0

    .line 1411
    .line 1412
    aput-object v26, v2, v17

    .line 1413
    .line 1414
    const/4 v10, 0x1

    .line 1415
    aput-object v22, v2, v10

    .line 1416
    .line 1417
    const/16 v18, 0x2

    .line 1418
    .line 1419
    aput-object v31, v2, v18

    .line 1420
    .line 1421
    goto :goto_2b

    .line 1422
    :cond_39
    move/from16 v2, v19

    .line 1423
    .line 1424
    const/4 v4, 0x3

    .line 1425
    const/4 v10, 0x1

    .line 1426
    const/16 v17, 0x0

    .line 1427
    .line 1428
    const/16 v18, 0x2

    .line 1429
    .line 1430
    new-array v2, v2, [Lxj6;

    .line 1431
    .line 1432
    aput-object v26, v2, v17

    .line 1433
    .line 1434
    aput-object v22, v2, v10

    .line 1435
    .line 1436
    aput-object v31, v2, v18

    .line 1437
    .line 1438
    aput-object p0, v2, v4

    .line 1439
    .line 1440
    :goto_2b
    new-instance v3, Lsa2;

    .line 1441
    .line 1442
    invoke-direct {v3, v0, v10}, Lsa2;-><init>(Lw50;B)V

    .line 1443
    .line 1444
    .line 1445
    :try_start_3
    invoke-virtual {v1, v3}, Lwl6;->M(Lsa2;)Lv67;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v0
    :try_end_3
    .catch Loj2; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lfr0; {:try_start_3 .. :try_end_3} :catch_2

    .line 1449
    goto :goto_2f

    .line 1450
    :catch_2
    move-exception v0

    .line 1451
    move-object v4, v0

    .line 1452
    const/4 v0, 0x0

    .line 1453
    goto :goto_2c

    .line 1454
    :catch_3
    move-exception v0

    .line 1455
    const/4 v4, 0x0

    .line 1456
    :goto_2c
    :try_start_4
    invoke-virtual {v3}, Lsa2;->l()V

    .line 1457
    .line 1458
    .line 1459
    const/4 v5, 0x0

    .line 1460
    iput-object v5, v3, Lsa2;->c:Ljava/lang/Object;

    .line 1461
    .line 1462
    iput-object v5, v3, Lsa2;->d:Ljava/lang/Object;

    .line 1463
    .line 1464
    const/4 v10, 0x1

    .line 1465
    iput-boolean v10, v3, Lsa2;->b:Z

    .line 1466
    .line 1467
    invoke-virtual {v3}, Lsa2;->k()Lav8;

    .line 1468
    .line 1469
    .line 1470
    invoke-virtual {v3}, Lsa2;->j()Lpj2;

    .line 1471
    .line 1472
    .line 1473
    iget-object v5, v3, Lsa2;->a:Ljava/lang/Object;

    .line 1474
    .line 1475
    check-cast v5, Lw50;

    .line 1476
    .line 1477
    const/4 v6, 0x0

    .line 1478
    :goto_2d
    iget v7, v5, Lw50;->X:I

    .line 1479
    .line 1480
    if-ge v6, v7, :cond_3c

    .line 1481
    .line 1482
    add-int/lit8 v7, v6, 0x1

    .line 1483
    .line 1484
    move v8, v7

    .line 1485
    :goto_2e
    iget v9, v5, Lw50;->Y:I

    .line 1486
    .line 1487
    if-ge v8, v9, :cond_3b

    .line 1488
    .line 1489
    invoke-virtual {v5, v6, v8}, Lw50;->b(II)Z

    .line 1490
    .line 1491
    .line 1492
    move-result v9

    .line 1493
    invoke-virtual {v5, v8, v6}, Lw50;->b(II)Z

    .line 1494
    .line 1495
    .line 1496
    move-result v10

    .line 1497
    if-eq v9, v10, :cond_3a

    .line 1498
    .line 1499
    invoke-virtual {v5, v8, v6}, Lw50;->a(II)V

    .line 1500
    .line 1501
    .line 1502
    invoke-virtual {v5, v6, v8}, Lw50;->a(II)V

    .line 1503
    .line 1504
    .line 1505
    :cond_3a
    add-int/lit8 v8, v8, 0x1

    .line 1506
    .line 1507
    goto :goto_2e

    .line 1508
    :cond_3b
    move v6, v7

    .line 1509
    goto :goto_2d

    .line 1510
    :cond_3c
    invoke-virtual {v1, v3}, Lwl6;->M(Lsa2;)Lv67;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v1

    .line 1514
    new-instance v3, Lg55;

    .line 1515
    .line 1516
    const/16 v5, 0x9

    .line 1517
    .line 1518
    invoke-direct {v3, v5}, Lg55;-><init>(B)V

    .line 1519
    .line 1520
    .line 1521
    iput-object v3, v1, Lv67;->h:Ljava/lang/Object;
    :try_end_4
    .catch Loj2; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lfr0; {:try_start_4 .. :try_end_4} :catch_4

    .line 1522
    .line 1523
    move-object v0, v1

    .line 1524
    :goto_2f
    iget v1, v0, Lv67;->a:I

    .line 1525
    .line 1526
    iget-object v3, v0, Lv67;->h:Ljava/lang/Object;

    .line 1527
    .line 1528
    check-cast v3, Lg55;

    .line 1529
    .line 1530
    if-eqz v3, :cond_3e

    .line 1531
    .line 1532
    array-length v3, v2

    .line 1533
    const/4 v4, 0x3

    .line 1534
    if-ge v3, v4, :cond_3d

    .line 1535
    .line 1536
    goto :goto_30

    .line 1537
    :cond_3d
    const/16 v17, 0x0

    .line 1538
    .line 1539
    aget-object v3, v2, v17

    .line 1540
    .line 1541
    const/16 v18, 0x2

    .line 1542
    .line 1543
    aget-object v4, v2, v18

    .line 1544
    .line 1545
    aput-object v4, v2, v17

    .line 1546
    .line 1547
    aput-object v3, v2, v18

    .line 1548
    .line 1549
    :cond_3e
    :goto_30
    new-instance v2, Lvj6;

    .line 1550
    .line 1551
    iget-object v3, v0, Lv67;->d:Ljava/lang/Object;

    .line 1552
    .line 1553
    check-cast v3, Ljava/lang/String;

    .line 1554
    .line 1555
    invoke-direct {v2, v3}, Lvj6;-><init>(Ljava/lang/String;)V

    .line 1556
    .line 1557
    .line 1558
    iget-object v3, v0, Lv67;->e:Ljava/lang/Object;

    .line 1559
    .line 1560
    check-cast v3, Ljava/util/List;

    .line 1561
    .line 1562
    if-eqz v3, :cond_3f

    .line 1563
    .line 1564
    sget-object v4, Lwj6;->X:Lwj6;

    .line 1565
    .line 1566
    invoke-virtual {v2, v4, v3}, Lvj6;->a(Lwj6;Ljava/lang/Object;)V

    .line 1567
    .line 1568
    .line 1569
    :cond_3f
    iget-object v3, v0, Lv67;->f:Ljava/lang/Object;

    .line 1570
    .line 1571
    check-cast v3, Ljava/lang/String;

    .line 1572
    .line 1573
    if-eqz v3, :cond_40

    .line 1574
    .line 1575
    sget-object v4, Lwj6;->Y:Lwj6;

    .line 1576
    .line 1577
    invoke-virtual {v2, v4, v3}, Lvj6;->a(Lwj6;Ljava/lang/Object;)V

    .line 1578
    .line 1579
    .line 1580
    :cond_40
    if-ltz v1, :cond_41

    .line 1581
    .line 1582
    iget v3, v0, Lv67;->b:I

    .line 1583
    .line 1584
    if-ltz v3, :cond_41

    .line 1585
    .line 1586
    sget-object v4, Lwj6;->f0:Lwj6;

    .line 1587
    .line 1588
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v3

    .line 1592
    invoke-virtual {v2, v4, v3}, Lvj6;->a(Lwj6;Ljava/lang/Object;)V

    .line 1593
    .line 1594
    .line 1595
    sget-object v3, Lwj6;->g0:Lwj6;

    .line 1596
    .line 1597
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v1

    .line 1601
    invoke-virtual {v2, v3, v1}, Lvj6;->a(Lwj6;Ljava/lang/Object;)V

    .line 1602
    .line 1603
    .line 1604
    :cond_41
    iget-object v1, v0, Lv67;->g:Ljava/lang/Object;

    .line 1605
    .line 1606
    check-cast v1, Ljava/lang/Integer;

    .line 1607
    .line 1608
    sget-object v3, Lwj6;->Z:Lwj6;

    .line 1609
    .line 1610
    invoke-virtual {v2, v3, v1}, Lvj6;->a(Lwj6;Ljava/lang/Object;)V

    .line 1611
    .line 1612
    .line 1613
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1614
    .line 1615
    const-string v3, "]Q"

    .line 1616
    .line 1617
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1618
    .line 1619
    .line 1620
    iget v0, v0, Lv67;->c:I

    .line 1621
    .line 1622
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1623
    .line 1624
    .line 1625
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v0

    .line 1629
    sget-object v1, Lwj6;->h0:Lwj6;

    .line 1630
    .line 1631
    invoke-virtual {v2, v1, v0}, Lvj6;->a(Lwj6;Ljava/lang/Object;)V

    .line 1632
    .line 1633
    .line 1634
    return-object v2

    .line 1635
    :catch_4
    if-eqz v0, :cond_42

    .line 1636
    .line 1637
    throw v0

    .line 1638
    :cond_42
    throw v4

    .line 1639
    :cond_43
    invoke-static {}, Lf65;->a()Lf65;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v0

    .line 1643
    throw v0

    .line 1644
    :catch_5
    invoke-static {}, Loj2;->a()Loj2;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v0

    .line 1648
    throw v0

    .line 1649
    :cond_44
    invoke-static {}, Loj2;->a()Loj2;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v0

    .line 1653
    throw v0

    .line 1654
    :cond_45
    invoke-static {}, Lf65;->a()Lf65;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v0

    .line 1658
    throw v0

    .line 1659
    :cond_46
    invoke-static {}, Lf65;->a()Lf65;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v0

    .line 1663
    throw v0

    .line 1664
    :cond_47
    invoke-static {}, Lf65;->a()Lf65;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v0

    .line 1668
    throw v0
.end method

.method public C(Ljava/util/ArrayList;)Z
    .locals 4

    .line 1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsu/happ/proxyutility/HappApplication;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    move v1, v0

    .line 15
    :catch_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {p0, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 28
    .line 29
    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v2, " ROOT management app detected!"

    .line 39
    .line 40
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Lu15;->k(Ljava/io/Serializable;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    return v1
.end method

.method public D(Lnt4;)V
    .locals 0

    .line 1
    return-void
.end method

.method public E()Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "\n"

    .line 4
    .line 5
    const-string v2, "\\A"

    .line 6
    .line 7
    new-instance v3, Ljava/util/ArrayList;

    .line 8
    .line 9
    sget-object v4, Lu15;->a:[Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v3}, Llr5;->C(Ljava/util/ArrayList;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_c

    .line 23
    .line 24
    new-instance v3, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    sget-object v5, Lu15;->b:[Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v3}, Llr5;->C(Ljava/util/ArrayList;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_c

    .line 43
    .line 44
    const-string v3, "su"

    .line 45
    .line 46
    invoke-static {v3}, Llr5;->y(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_c

    .line 51
    .line 52
    new-instance v5, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v0, "ro.debuggable"

    .line 58
    .line 59
    const-string v6, "1"

    .line 60
    .line 61
    invoke-virtual {v5, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    const-string v0, "ro.secure"

    .line 65
    .line 66
    const-string v6, "0"

    .line 67
    .line 68
    invoke-virtual {v5, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v7, "getprop"

    .line 76
    .line 77
    invoke-virtual {v0, v7}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-nez v0, :cond_0

    .line 86
    .line 87
    :goto_0
    const/4 v0, 0x0

    .line 88
    goto :goto_2

    .line 89
    :cond_0
    new-instance v7, Ljava/util/Scanner;

    .line 90
    .line 91
    invoke-direct {v7, v0}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v7, v2}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/util/Scanner;->next()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    goto :goto_2

    .line 107
    :catch_0
    move-exception v0

    .line 108
    goto :goto_1

    .line 109
    :catch_1
    move-exception v0

    .line 110
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :goto_2
    if-nez v0, :cond_1

    .line 115
    .line 116
    const/4 v10, 0x0

    .line 117
    goto :goto_5

    .line 118
    :cond_1
    array-length v8, v0

    .line 119
    const/4 v9, 0x0

    .line 120
    const/4 v10, 0x0

    .line 121
    :goto_3
    if-ge v9, v8, :cond_4

    .line 122
    .line 123
    aget-object v11, v0, v9

    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    :cond_2
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    if-eqz v13, :cond_3

    .line 138
    .line 139
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    check-cast v13, Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v11, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v14

    .line 149
    if-eqz v14, :cond_2

    .line 150
    .line 151
    invoke-virtual {v5, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v14

    .line 155
    check-cast v14, Ljava/lang/String;

    .line 156
    .line 157
    const-string v15, "["

    .line 158
    .line 159
    const-string v6, "]"

    .line 160
    .line 161
    invoke-static {v15, v14, v6}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-virtual {v11, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 166
    .line 167
    .line 168
    move-result v14

    .line 169
    if-eqz v14, :cond_2

    .line 170
    .line 171
    new-instance v10, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v13, " = "

    .line 180
    .line 181
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v6, " detected!"

    .line 188
    .line 189
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-static {}, Lu15;->y()V

    .line 193
    .line 194
    .line 195
    const/4 v10, 0x1

    .line 196
    goto :goto_4

    .line 197
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_4
    :goto_5
    if-nez v10, :cond_c

    .line 201
    .line 202
    :try_start_1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    const-string v5, "mount"

    .line 207
    .line 208
    invoke-virtual {v0, v5}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    if-nez v0, :cond_5

    .line 217
    .line 218
    :goto_6
    const/4 v0, 0x0

    .line 219
    goto :goto_8

    .line 220
    :cond_5
    new-instance v5, Ljava/util/Scanner;

    .line 221
    .line 222
    invoke-direct {v5, v0}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v5, v2}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v0}, Ljava/util/Scanner;->next()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/util/NoSuchElementException; {:try_start_1 .. :try_end_1} :catch_2

    .line 237
    goto :goto_8

    .line 238
    :catch_2
    move-exception v0

    .line 239
    goto :goto_7

    .line 240
    :catch_3
    move-exception v0

    .line 241
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 242
    .line 243
    .line 244
    goto :goto_6

    .line 245
    :goto_8
    if-nez v0, :cond_6

    .line 246
    .line 247
    const/4 v5, 0x0

    .line 248
    goto/16 :goto_e

    .line 249
    .line 250
    :cond_6
    array-length v1, v0

    .line 251
    const/4 v2, 0x0

    .line 252
    const/4 v5, 0x0

    .line 253
    :goto_9
    if-ge v2, v1, :cond_b

    .line 254
    .line 255
    aget-object v6, v0, v2

    .line 256
    .line 257
    const-string v8, " "

    .line 258
    .line 259
    invoke-virtual {v6, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    array-length v9, v8

    .line 264
    const/4 v10, 0x6

    .line 265
    if-ge v9, v10, :cond_7

    .line 266
    .line 267
    const-string v8, "Error formatting mount line: "

    .line 268
    .line 269
    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    invoke-static {v6}, Lu15;->k(Ljava/io/Serializable;)V

    .line 274
    .line 275
    .line 276
    goto :goto_d

    .line 277
    :cond_7
    const/4 v9, 0x2

    .line 278
    aget-object v9, v8, v9

    .line 279
    .line 280
    const/4 v10, 0x5

    .line 281
    aget-object v8, v8, v10

    .line 282
    .line 283
    sget-object v10, Lu15;->d:[Ljava/lang/String;

    .line 284
    .line 285
    const/4 v11, 0x0

    .line 286
    :goto_a
    const/4 v12, 0x7

    .line 287
    if-ge v11, v12, :cond_a

    .line 288
    .line 289
    aget-object v12, v10, v11

    .line 290
    .line 291
    invoke-virtual {v9, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 292
    .line 293
    .line 294
    move-result v13

    .line 295
    if-eqz v13, :cond_9

    .line 296
    .line 297
    const-string v13, "("

    .line 298
    .line 299
    const-string v14, ""

    .line 300
    .line 301
    invoke-virtual {v8, v13, v14}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    const-string v13, ")"

    .line 306
    .line 307
    invoke-virtual {v8, v13, v14}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    const-string v13, ","

    .line 312
    .line 313
    invoke-virtual {v8, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v13

    .line 317
    array-length v14, v13

    .line 318
    const/4 v15, 0x0

    .line 319
    :goto_b
    if-ge v15, v14, :cond_9

    .line 320
    .line 321
    aget-object v7, v13, v15

    .line 322
    .line 323
    const-string v4, "rw"

    .line 324
    .line 325
    invoke-virtual {v7, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    if-eqz v4, :cond_8

    .line 330
    .line 331
    new-instance v4, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const-string v5, " path is mounted with rw permissions! "

    .line 340
    .line 341
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-static {}, Lu15;->y()V

    .line 348
    .line 349
    .line 350
    const/4 v5, 0x1

    .line 351
    goto :goto_c

    .line 352
    :cond_8
    add-int/lit8 v15, v15, 0x1

    .line 353
    .line 354
    goto :goto_b

    .line 355
    :cond_9
    :goto_c
    add-int/lit8 v11, v11, 0x1

    .line 356
    .line 357
    goto :goto_a

    .line 358
    :cond_a
    :goto_d
    add-int/lit8 v2, v2, 0x1

    .line 359
    .line 360
    goto :goto_9

    .line 361
    :cond_b
    :goto_e
    if-nez v5, :cond_c

    .line 362
    .line 363
    sget-object v0, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 364
    .line 365
    if-eqz v0, :cond_d

    .line 366
    .line 367
    const-string v1, "test-keys"

    .line 368
    .line 369
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-eqz v0, :cond_d

    .line 374
    .line 375
    :cond_c
    const/4 v1, 0x1

    .line 376
    goto/16 :goto_13

    .line 377
    .line 378
    :cond_d
    :try_start_2
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    const-string v1, "which"

    .line 383
    .line 384
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    .line 389
    .line 390
    .line 391
    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 392
    :try_start_3
    new-instance v0, Ljava/io/BufferedReader;

    .line 393
    .line 394
    new-instance v1, Ljava/io/InputStreamReader;

    .line 395
    .line 396
    invoke-virtual {v6}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-direct {v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 401
    .line 402
    .line 403
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 410
    if-eqz v0, :cond_e

    .line 411
    .line 412
    const/4 v0, 0x1

    .line 413
    goto :goto_f

    .line 414
    :cond_e
    const/4 v0, 0x0

    .line 415
    :goto_f
    invoke-virtual {v6}, Ljava/lang/Process;->destroy()V

    .line 416
    .line 417
    .line 418
    goto :goto_10

    .line 419
    :catchall_0
    const/4 v6, 0x0

    .line 420
    :catchall_1
    if-eqz v6, :cond_f

    .line 421
    .line 422
    invoke-virtual {v6}, Ljava/lang/Process;->destroy()V

    .line 423
    .line 424
    .line 425
    :cond_f
    const/4 v0, 0x0

    .line 426
    :goto_10
    if-nez v0, :cond_c

    .line 427
    .line 428
    new-instance v0, Lcom/scottyab/rootbeer/RootBeerNative;

    .line 429
    .line 430
    sget-boolean v0, Lcom/scottyab/rootbeer/RootBeerNative;->a:Z

    .line 431
    .line 432
    if-nez v0, :cond_10

    .line 433
    .line 434
    const-string v0, "We could not load the native library to test for root"

    .line 435
    .line 436
    invoke-static {v0}, Lu15;->k(Ljava/io/Serializable;)V

    .line 437
    .line 438
    .line 439
    const/4 v1, 0x1

    .line 440
    goto :goto_12

    .line 441
    :cond_10
    invoke-static {}, Lu15;->x()[Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    array-length v1, v0

    .line 446
    new-array v2, v1, [Ljava/lang/String;

    .line 447
    .line 448
    const/4 v4, 0x0

    .line 449
    :goto_11
    if-ge v4, v1, :cond_11

    .line 450
    .line 451
    new-instance v5, Ljava/lang/StringBuilder;

    .line 452
    .line 453
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 454
    .line 455
    .line 456
    aget-object v6, v0, v4

    .line 457
    .line 458
    invoke-static {v5, v6, v3}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v5

    .line 462
    aput-object v5, v2, v4

    .line 463
    .line 464
    add-int/lit8 v4, v4, 0x1

    .line 465
    .line 466
    goto :goto_11

    .line 467
    :cond_11
    new-instance v0, Lcom/scottyab/rootbeer/RootBeerNative;

    .line 468
    .line 469
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 470
    .line 471
    .line 472
    const/4 v1, 0x1

    .line 473
    :try_start_4
    invoke-virtual {v0, v1}, Lcom/scottyab/rootbeer/RootBeerNative;->setLogDebugMessages(Z)I

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0, v2}, Lcom/scottyab/rootbeer/RootBeerNative;->checkForRoot([Ljava/lang/Object;)I

    .line 477
    .line 478
    .line 479
    move-result v0
    :try_end_4
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_4 .. :try_end_4} :catch_4

    .line 480
    if-lez v0, :cond_12

    .line 481
    .line 482
    goto :goto_13

    .line 483
    :catch_4
    :cond_12
    :goto_12
    const-string v0, "magisk"

    .line 484
    .line 485
    invoke-static {v0}, Llr5;->y(Ljava/lang/String;)Z

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    if-eqz v0, :cond_13

    .line 490
    .line 491
    goto :goto_13

    .line 492
    :cond_13
    const/4 v4, 0x0

    .line 493
    goto :goto_14

    .line 494
    :goto_13
    move v4, v1

    .line 495
    :goto_14
    return v4
.end method

.method public F(Llf3;)V
    .locals 3

    .line 1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Region;

    .line 4
    .line 5
    iget v0, p1, Llf3;->a:I

    .line 6
    .line 7
    iget v1, p1, Llf3;->b:I

    .line 8
    .line 9
    iget v2, p1, Llf3;->c:I

    .line 10
    .line 11
    iget p1, p1, Llf3;->d:I

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/graphics/Region;->set(IIII)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public K(Ljava/lang/Object;Led6;)V
    .locals 2

    .line 1
    iget-byte v0, p0, Llr5;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lp43;

    .line 7
    .line 8
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ll39;

    .line 11
    .line 12
    new-instance v0, Luh5;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lth5;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lth5;-><init>(Ll39;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, v0, Luh5;->X:Lth5;

    .line 23
    .line 24
    invoke-static {v0}, Lw79;->K(Landroid/os/Parcelable;)[B

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p1, p2, p0}, Lp43;->m(Lr43;[B)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    check-cast p1, Ld43;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;

    .line 40
    .line 41
    iget-object v0, p0, Lec4;->b:Landroidx/work/WorkerParameters;

    .line 42
    .line 43
    iget-object v0, v0, Landroidx/work/WorkerParameters;->b:Lu91;

    .line 44
    .line 45
    const-string v1, "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lu91;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    new-instance v1, Lkh5;

    .line 54
    .line 55
    iget-object p0, p0, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->f:Landroidx/work/WorkerParameters;

    .line 56
    .line 57
    invoke-direct {v1, v0, p0}, Lkh5;-><init>(Ljava/lang/String;Landroidx/work/WorkerParameters;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, Lw79;->K(Landroid/os/Parcelable;)[B

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, p2, p0}, Ld43;->h(Lr43;[B)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const-string p0, "Need to specify a class name for the RemoteListenableWorker to delegate to."

    .line 72
    .line 73
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    return-void

    .line 77
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public a()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public b(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lsx7;

    .line 6
    .line 7
    invoke-virtual {p0}, Lsx7;->run()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public c()V
    .locals 0

    .line 1
    return-void
.end method

.method public d(Lwk;Lwk;Lwk;)J
    .locals 0

    .line 1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyr6;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lyr6;->d(Lwk;Lwk;Lwk;)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0
.end method

.method public e()I
    .locals 2

    .line 1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lay6;

    .line 4
    .line 5
    iget-object v0, p0, Lay6;->X:Loh5;

    .line 6
    .line 7
    iget-object v1, p0, Lay6;->f0:Lrh5;

    .line 8
    .line 9
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lay6;->h0:Loh5;

    .line 22
    .line 23
    invoke-virtual {p0}, Loh5;->l()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-virtual {v0}, Loh5;->l()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    sub-int/2addr p0, v0

    .line 32
    return p0

    .line 33
    :cond_0
    invoke-virtual {v0}, Loh5;->l()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0
.end method

.method public f(Landroid/view/View;)Z
    .locals 2

    .line 1
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 2
    .line 3
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lyr6;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x1

    .line 12
    add-int/2addr p1, v0

    .line 13
    iget-object p0, p0, Lyr6;->g0:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 16
    .line 17
    iget-boolean v1, p0, Landroidx/viewpager2/widget/ViewPager2;->w0:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2;->b(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return v0
.end method

.method public g(Lv15;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lx66;

    .line 4
    .line 5
    invoke-virtual {p1}, Lv15;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "version"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    instance-of p1, p2, [I

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    check-cast p2, [I

    .line 22
    .line 23
    iput-object p2, p0, Lx66;->X:[I

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string v0, "multifileClassName"

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    instance-of p1, p2, Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    check-cast p2, Ljava/lang/String;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p2, 0x0

    .line 42
    :goto_0
    iput-object p2, p0, Lx66;->Y:Ljava/lang/String;

    .line 43
    .line 44
    :cond_2
    return-void
.end method

.method public get(I)Lne2;
    .locals 0

    .line 1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lte2;

    .line 4
    .line 5
    return-object p0
.end method

.method public h(Lxx6;Ljava/lang/Float;Ljava/lang/Float;Lgn2;Lwc7;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 p3, 0x0

    .line 10
    const/16 v0, 0x1c

    .line 11
    .line 12
    invoke-static {p3, p2, v0}, Lz68;->b(FFI)Lqk;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    mul-float v1, p2, p3

    .line 25
    .line 26
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v4, p0

    .line 29
    check-cast v4, Lpk;

    .line 30
    .line 31
    move-object v0, p1

    .line 32
    move-object v5, p4

    .line 33
    move-object v6, p5

    .line 34
    invoke-static/range {v0 .. v6}, Lu70;->v(Lxx6;FFLqk;Lpk;Lgn2;Ls51;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget-object p1, Lc71;->X:Lc71;

    .line 39
    .line 40
    if-ne p0, p1, :cond_0

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_0
    check-cast p0, Lmk;

    .line 44
    .line 45
    return-object p0
.end method

.method public i(Lfb9;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lfb9;->f()Ljava/lang/Exception;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p1, Lfb9;->d:Z

    .line 8
    .line 9
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lmm0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1}, Lmm0;->z(Ljava/lang/Throwable;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p1}, Lfb9;->g()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Lmm0;->f(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lmm0;

    .line 31
    .line 32
    new-instance p1, Lrj6;

    .line 33
    .line 34
    invoke-direct {p1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lmm0;->f(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public j(Lj71;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Luh3;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Luh3;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public k()V
    .locals 5

    .line 1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lwu7;

    .line 4
    .line 5
    iget-object p0, p0, Lwu7;->w1:Luu7;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 12
    .line 13
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Ltp1;->a:Lnf1;

    .line 18
    .line 19
    sget-object v1, Ldm4;->a:Lhv2;

    .line 20
    .line 21
    new-instance v2, Lnk4;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x2

    .line 25
    invoke-direct {v2, p0, v3, v4}, Lnk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1, v2, v4}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public l(Lnt4;Landroid/view/MenuItem;)Z
    .locals 5

    .line 1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lf63;

    .line 4
    .line 5
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljn0;

    .line 8
    .line 9
    if-eqz p0, :cond_c

    .line 10
    .line 11
    iget-object p1, p0, Ljn0;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 14
    .line 15
    iget-object p0, p0, Ljn0;->Z:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/lang/String;

    .line 18
    .line 19
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 20
    .line 21
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sget v1, Le46;->import_sub:I

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x1

    .line 29
    if-ne v0, v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0, v2}, Lsu/happ/proxyutility/feature/main/MainViewModel;->w(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p1, Lsu/happ/proxyutility/feature/main/MainActivity;->j1:Ly5;

    .line 39
    .line 40
    invoke-virtual {p0}, Ly5;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lkr7;

    .line 45
    .line 46
    new-instance p1, Lzq7;

    .line 47
    .line 48
    invoke-direct {p1, v2}, Lzq7;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lkr7;->f(Lgr7;)V

    .line 52
    .line 53
    .line 54
    return v3

    .line 55
    :cond_0
    sget v1, Le46;->import_clipboard:I

    .line 56
    .line 57
    if-ne v0, v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p1}, Lsu/happ/proxyutility/feature/main/MainActivity;->N()V

    .line 60
    .line 61
    .line 62
    return v3

    .line 63
    :cond_1
    sget v1, Le46;->import_qrcode:I

    .line 64
    .line 65
    if-ne v0, v1, :cond_2

    .line 66
    .line 67
    invoke-virtual {p1}, Lsu/happ/proxyutility/feature/main/MainActivity;->R()V

    .line 68
    .line 69
    .line 70
    return v3

    .line 71
    :cond_2
    sget v1, Le46;->import_manually:I

    .line 72
    .line 73
    if-ne v0, v1, :cond_3

    .line 74
    .line 75
    new-instance p0, Landroid/content/Intent;

    .line 76
    .line 77
    invoke-direct {p0}, Landroid/content/Intent;-><init>()V

    .line 78
    .line 79
    .line 80
    const-class p2, Lsu/happ/proxyutility/ui/ServerActivity;

    .line 81
    .line 82
    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 87
    .line 88
    .line 89
    return v3

    .line 90
    :cond_3
    sget v1, Le46;->import_json_clipboard:I

    .line 91
    .line 92
    if-ne v0, v1, :cond_6

    .line 93
    .line 94
    :try_start_0
    sget-object p0, Lss8;->a:Lss8;

    .line 95
    .line 96
    invoke-static {p1}, Lss8;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-eqz p2, :cond_4

    .line 105
    .line 106
    sget-object p0, Lm83;->a:Lm83;

    .line 107
    .line 108
    invoke-virtual {p1, p0, v3}, Lsu/happ/proxyutility/feature/main/MainActivity;->J(Lt83;Z)V

    .line 109
    .line 110
    .line 111
    return v3

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    goto :goto_0

    .line 114
    :cond_4
    invoke-virtual {p1, p0, v3}, Lsu/happ/proxyutility/feature/main/MainActivity;->Q(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :goto_0
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 119
    .line 120
    if-nez p1, :cond_5

    .line 121
    .line 122
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 123
    .line 124
    if-nez p1, :cond_5

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_5
    throw p0

    .line 128
    :cond_6
    sget v1, Le46;->export_json_clipboard:I

    .line 129
    .line 130
    if-ne v0, v1, :cond_8

    .line 131
    .line 132
    if-eqz p0, :cond_9

    .line 133
    .line 134
    sget-object p2, Lkw2;->a:Lkw2;

    .line 135
    .line 136
    invoke-static {p1, p0}, Lkw2;->l(Landroid/content/Context;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-nez p0, :cond_7

    .line 141
    .line 142
    sget p0, Ly46;->toast_success:I

    .line 143
    .line 144
    invoke-static {p1, p0}, Lpu;->Q(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 145
    .line 146
    .line 147
    return v3

    .line 148
    :cond_7
    sget p0, Ly46;->toast_failure:I

    .line 149
    .line 150
    invoke-static {p1, p0}, Lpu;->M(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 151
    .line 152
    .line 153
    return v3

    .line 154
    :cond_8
    sget v1, Le46;->config_group:I

    .line 155
    .line 156
    if-ne v0, v1, :cond_a

    .line 157
    .line 158
    new-instance p2, Lnn1;

    .line 159
    .line 160
    sget v0, Lt46;->dialog_create_group_config:I

    .line 161
    .line 162
    const/16 v1, 0x11

    .line 163
    .line 164
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    const/16 v4, 0x1a

    .line 169
    .line 170
    invoke-direct {p2, v0, v4, v1, v2}, Ld8;-><init>(IILjava/lang/Integer;Ljava/lang/Integer;)V

    .line 171
    .line 172
    .line 173
    const-string v0, ""

    .line 174
    .line 175
    iput-object v0, p2, Lnn1;->C1:Ljava/lang/String;

    .line 176
    .line 177
    sget-object v0, Lsu/happ/proxyutility/dto/enums/EConfigObservatoryType;->LEAST_PING:Lsu/happ/proxyutility/dto/enums/EConfigObservatoryType;

    .line 178
    .line 179
    iput-object v0, p2, Lnn1;->F1:Lsu/happ/proxyutility/dto/enums/EConfigObservatoryType;

    .line 180
    .line 181
    new-instance v0, Lh80;

    .line 182
    .line 183
    const/16 v1, 0xc

    .line 184
    .line 185
    invoke-direct {v0, v1}, Lh80;-><init>(B)V

    .line 186
    .line 187
    .line 188
    iput-object v0, p2, Lnn1;->G1:Lgn2;

    .line 189
    .line 190
    const-string v0, "DialogCreateConfigGroup"

    .line 191
    .line 192
    invoke-static {p1, p2, v0}, Ld8;->a0(Lsu/happ/proxyutility/ui/BaseActivity;Lsn1;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    iput-object p0, p2, Lnn1;->E1:Ljava/lang/String;

    .line 196
    .line 197
    new-instance p0, Lzw2;

    .line 198
    .line 199
    const/16 v0, 0xe

    .line 200
    .line 201
    invoke-direct {p0, p2, p1, v0}, Lzw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 202
    .line 203
    .line 204
    iput-object p0, p2, Lnn1;->G1:Lgn2;

    .line 205
    .line 206
    sget p0, Ly46;->create_config_group_title:I

    .line 207
    .line 208
    invoke-virtual {p2, p0}, Lqk2;->p(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    iput-object p0, p2, Lnn1;->C1:Ljava/lang/String;

    .line 216
    .line 217
    iget-object p1, p2, Lnn1;->z1:Landroid/widget/TextView;

    .line 218
    .line 219
    if-eqz p1, :cond_9

    .line 220
    .line 221
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    .line 223
    .line 224
    :cond_9
    :goto_1
    return v3

    .line 225
    :cond_a
    sget p0, Le46;->dialog_test:I

    .line 226
    .line 227
    if-ne v0, p0, :cond_b

    .line 228
    .line 229
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->h()Lg94;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-static {p0}, Lys0;->z(Lg94;)Lu84;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    sget-object p2, Ltp1;->a:Lnf1;

    .line 238
    .line 239
    sget-object p2, Lye1;->Z:Lye1;

    .line 240
    .line 241
    new-instance v0, Lnk4;

    .line 242
    .line 243
    const/4 v1, 0x4

    .line 244
    invoke-direct {v0, p1, v2, v1}, Lnk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 245
    .line 246
    .line 247
    const/4 p1, 0x2

    .line 248
    invoke-static {p0, p2, v2, v0, p1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 249
    .line 250
    .line 251
    return v3

    .line 252
    :cond_b
    invoke-interface {p2}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    sget p2, Ly46;->share_tv:I

    .line 257
    .line 258
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    invoke-static {p0, p2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    if-eqz p0, :cond_c

    .line 267
    .line 268
    invoke-virtual {p1}, Lsu/happ/proxyutility/feature/main/MainActivity;->Z()V

    .line 269
    .line 270
    .line 271
    return v3

    .line 272
    :cond_c
    const/4 p0, 0x0

    .line 273
    return p0
.end method

.method public m(JLwk;Lwk;Lwk;)Lwk;
    .locals 6

    .line 1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Lyr6;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lyr6;->m(JLwk;Lwk;Lwk;)Lwk;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public n(Lv15;Lvs0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public o(Ljava/lang/String;)Lqr6;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Lww7;

    .line 5
    .line 6
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lax7;

    .line 9
    .line 10
    invoke-interface {p0}, Lax7;->g0()Lsm2;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {p1, p0}, Lww7;-><init>(Lsm2;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method

.method public p()I
    .locals 0

    .line 1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lay6;

    .line 4
    .line 5
    iget-object p0, p0, Lay6;->Z:Loh5;

    .line 6
    .line 7
    invoke-virtual {p0}, Loh5;->l()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public q(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Lwu7;

    .line 7
    .line 8
    iget-object p0, p0, Lwu7;->w1:Luu7;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    check-cast p0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 15
    .line 16
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Ltp1;->a:Lnf1;

    .line 21
    .line 22
    sget-object v1, Lye1;->Z:Lye1;

    .line 23
    .line 24
    new-instance v2, Lfk4;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x4

    .line 28
    invoke-direct {v2, p0, p1, v3, v4}, Lfk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lq51;B)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x2

    .line 32
    invoke-static {v0, v1, v2, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public r(Lv15;)Lj04;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lv15;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "data"

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    const-string v0, "filePartClassNames"

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "strings"

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    new-instance p1, Lw66;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-direct {p1, p0, v0}, Lw66;-><init>(Llr5;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_1
    const/4 p0, 0x0

    .line 38
    return-object p0

    .line 39
    :cond_2
    :goto_0
    new-instance p1, Lw66;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-direct {p1, p0, v0}, Lw66;-><init>(Llr5;B)V

    .line 43
    .line 44
    .line 45
    return-object p1
.end method

.method public s()I
    .locals 0

    .line 1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lay6;

    .line 4
    .line 5
    iget-object p0, p0, Lay6;->Y:Loh5;

    .line 6
    .line 7
    invoke-virtual {p0}, Loh5;->l()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public t(Lv15;Lqs0;Lv15;)V
    .locals 0

    .line 1
    return-void
.end method

.method public u(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public w(Lqs0;Lv15;)Li04;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public z(JLwk;Lwk;Lwk;)Lwk;
    .locals 6

    .line 1
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Lyr6;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lyr6;->z(JLwk;Lwk;Lwk;)Lwk;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
