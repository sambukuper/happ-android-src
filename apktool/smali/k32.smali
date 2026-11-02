.class public final Lk32;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ll32;
.implements Lzw7;
.implements Lzn2;
.implements Ly23;
.implements Lmu0;
.implements Les5;


# static fields
.field public static volatile X:Lk32;

.field public static Y:Lk32;


# direct methods
.method public static b(Ljava/lang/String;IIILjava/lang/String;)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    and-int/lit8 v2, p3, 0x1

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move v2, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move/from16 v2, p1

    .line 13
    .line 14
    :goto_0
    and-int/lit8 v4, p3, 0x2

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move/from16 v4, p2

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v5, p3, 0x8

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    if-eqz v5, :cond_2

    .line 29
    .line 30
    move v5, v3

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move v5, v6

    .line 33
    :goto_2
    and-int/lit8 v7, p3, 0x10

    .line 34
    .line 35
    if-eqz v7, :cond_3

    .line 36
    .line 37
    move v7, v3

    .line 38
    goto :goto_3

    .line 39
    :cond_3
    move v7, v6

    .line 40
    :goto_3
    and-int/lit8 v8, p3, 0x20

    .line 41
    .line 42
    if-eqz v8, :cond_4

    .line 43
    .line 44
    move v8, v3

    .line 45
    goto :goto_4

    .line 46
    :cond_4
    move v8, v6

    .line 47
    :goto_4
    and-int/lit8 v9, p3, 0x40

    .line 48
    .line 49
    if-eqz v9, :cond_5

    .line 50
    .line 51
    goto :goto_5

    .line 52
    :cond_5
    move v3, v6

    .line 53
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move v6, v2

    .line 57
    :goto_6
    if-ge v6, v4, :cond_13

    .line 58
    .line 59
    invoke-virtual {v0, v6}, Ljava/lang/String;->codePointAt(I)I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    const/16 v10, 0x80

    .line 64
    .line 65
    const/16 v11, 0x20

    .line 66
    .line 67
    const/16 v12, 0x2b

    .line 68
    .line 69
    const/16 v13, 0x25

    .line 70
    .line 71
    const/16 v14, 0x7f

    .line 72
    .line 73
    if-lt v9, v11, :cond_9

    .line 74
    .line 75
    if-eq v9, v14, :cond_9

    .line 76
    .line 77
    if-lt v9, v10, :cond_6

    .line 78
    .line 79
    if-eqz v3, :cond_9

    .line 80
    .line 81
    :cond_6
    int-to-char v15, v9

    .line 82
    invoke-static {v1, v15}, Lfm7;->e0(Ljava/lang/CharSequence;C)Z

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    if-nez v15, :cond_9

    .line 87
    .line 88
    if-ne v9, v13, :cond_7

    .line 89
    .line 90
    if-eqz v5, :cond_9

    .line 91
    .line 92
    if-eqz v7, :cond_7

    .line 93
    .line 94
    invoke-static {v0, v6, v4}, Lk32;->j(Ljava/lang/String;II)Z

    .line 95
    .line 96
    .line 97
    move-result v15

    .line 98
    if-eqz v15, :cond_9

    .line 99
    .line 100
    :cond_7
    if-ne v9, v12, :cond_8

    .line 101
    .line 102
    if-eqz v8, :cond_8

    .line 103
    .line 104
    goto :goto_7

    .line 105
    :cond_8
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    add-int/2addr v6, v9

    .line 110
    goto :goto_6

    .line 111
    :cond_9
    :goto_7
    new-instance v9, Li90;

    .line 112
    .line 113
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v9, v2, v6, v0}, Li90;->c1(IILjava/lang/String;)V

    .line 117
    .line 118
    .line 119
    const/4 v2, 0x0

    .line 120
    :goto_8
    if-ge v6, v4, :cond_12

    .line 121
    .line 122
    invoke-virtual {v0, v6}, Ljava/lang/String;->codePointAt(I)I

    .line 123
    .line 124
    .line 125
    move-result v15

    .line 126
    if-eqz v5, :cond_a

    .line 127
    .line 128
    const/16 v13, 0x9

    .line 129
    .line 130
    if-eq v15, v13, :cond_f

    .line 131
    .line 132
    const/16 v13, 0xa

    .line 133
    .line 134
    if-eq v15, v13, :cond_f

    .line 135
    .line 136
    const/16 v13, 0xc

    .line 137
    .line 138
    if-eq v15, v13, :cond_f

    .line 139
    .line 140
    const/16 v13, 0xd

    .line 141
    .line 142
    if-ne v15, v13, :cond_a

    .line 143
    .line 144
    goto :goto_a

    .line 145
    :cond_a
    if-ne v15, v12, :cond_c

    .line 146
    .line 147
    if-eqz v8, :cond_c

    .line 148
    .line 149
    if-eqz v5, :cond_b

    .line 150
    .line 151
    const-string v13, "+"

    .line 152
    .line 153
    goto :goto_9

    .line 154
    :cond_b
    const-string v13, "%2B"

    .line 155
    .line 156
    :goto_9
    invoke-virtual {v9, v13}, Li90;->d1(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_a

    .line 160
    :cond_c
    if-lt v15, v11, :cond_10

    .line 161
    .line 162
    if-eq v15, v14, :cond_10

    .line 163
    .line 164
    if-lt v15, v10, :cond_d

    .line 165
    .line 166
    if-eqz v3, :cond_10

    .line 167
    .line 168
    :cond_d
    int-to-char v13, v15

    .line 169
    invoke-static {v1, v13}, Lfm7;->e0(Ljava/lang/CharSequence;C)Z

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    if-nez v13, :cond_10

    .line 174
    .line 175
    const/16 v13, 0x25

    .line 176
    .line 177
    if-ne v15, v13, :cond_e

    .line 178
    .line 179
    if-eqz v5, :cond_10

    .line 180
    .line 181
    if-eqz v7, :cond_e

    .line 182
    .line 183
    invoke-static {v0, v6, v4}, Lk32;->j(Ljava/lang/String;II)Z

    .line 184
    .line 185
    .line 186
    move-result v13

    .line 187
    if-nez v13, :cond_e

    .line 188
    .line 189
    goto :goto_b

    .line 190
    :cond_e
    invoke-virtual {v9, v15}, Li90;->e1(I)V

    .line 191
    .line 192
    .line 193
    :cond_f
    :goto_a
    const/16 v11, 0x25

    .line 194
    .line 195
    goto :goto_d

    .line 196
    :cond_10
    :goto_b
    if-nez v2, :cond_11

    .line 197
    .line 198
    new-instance v2, Li90;

    .line 199
    .line 200
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 201
    .line 202
    .line 203
    :cond_11
    invoke-virtual {v2, v15}, Li90;->e1(I)V

    .line 204
    .line 205
    .line 206
    :goto_c
    invoke-virtual {v2}, Li90;->F()Z

    .line 207
    .line 208
    .line 209
    move-result v13

    .line 210
    if-nez v13, :cond_f

    .line 211
    .line 212
    invoke-virtual {v2}, Li90;->readByte()B

    .line 213
    .line 214
    .line 215
    move-result v13

    .line 216
    and-int/lit16 v10, v13, 0xff

    .line 217
    .line 218
    const/16 v11, 0x25

    .line 219
    .line 220
    invoke-virtual {v9, v11}, Li90;->H0(I)V

    .line 221
    .line 222
    .line 223
    shr-int/lit8 v10, v10, 0x4

    .line 224
    .line 225
    and-int/lit8 v10, v10, 0xf

    .line 226
    .line 227
    sget-object v16, Lu23;->j:[C

    .line 228
    .line 229
    aget-char v10, v16, v10

    .line 230
    .line 231
    invoke-virtual {v9, v10}, Li90;->H0(I)V

    .line 232
    .line 233
    .line 234
    and-int/lit8 v10, v13, 0xf

    .line 235
    .line 236
    aget-char v10, v16, v10

    .line 237
    .line 238
    invoke-virtual {v9, v10}, Li90;->H0(I)V

    .line 239
    .line 240
    .line 241
    const/16 v10, 0x80

    .line 242
    .line 243
    const/16 v11, 0x20

    .line 244
    .line 245
    goto :goto_c

    .line 246
    :goto_d
    invoke-static {v15}, Ljava/lang/Character;->charCount(I)I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    add-int/2addr v6, v10

    .line 251
    move v13, v11

    .line 252
    const/16 v10, 0x80

    .line 253
    .line 254
    const/16 v11, 0x20

    .line 255
    .line 256
    goto/16 :goto_8

    .line 257
    .line 258
    :cond_12
    invoke-virtual {v9}, Li90;->Y()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    return-object v0

    .line 263
    :cond_13
    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    return-object v0
.end method

.method public static c(Laa7;Ld3;ILkh8;ZZ)Lfc0;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p5

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    sget-object v5, Lkh8;->Z:Lkh8;

    .line 10
    .line 11
    if-eq v1, v5, :cond_0

    .line 12
    .line 13
    move v6, v4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v6, v3

    .line 16
    :goto_0
    if-eqz v2, :cond_2

    .line 17
    .line 18
    if-nez p4, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v7, v3

    .line 22
    goto :goto_2

    .line 23
    :cond_2
    :goto_1
    move v7, v4

    .line 24
    :goto_2
    const/4 v8, 0x0

    .line 25
    if-nez v6, :cond_3

    .line 26
    .line 27
    invoke-virtual/range {p0 .. p0}, Lt14;->l0()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_3

    .line 36
    .line 37
    new-instance v0, Lfc0;

    .line 38
    .line 39
    invoke-direct {v0, v8, v4, v3}, Lfc0;-><init>(Laa7;IZ)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lt14;->n0()Llh8;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-interface {v6}, Llh8;->x()Lot0;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    if-nez v6, :cond_4

    .line 52
    .line 53
    new-instance v0, Lfc0;

    .line 54
    .line 55
    invoke-direct {v0, v8, v4, v3}, Lfc0;-><init>(Laa7;IZ)V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_4
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    invoke-virtual {v0, v9}, Ld3;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    check-cast v9, Lql3;

    .line 68
    .line 69
    sget-object v10, Lth8;->a:Lvm;

    .line 70
    .line 71
    if-eq v1, v5, :cond_5

    .line 72
    .line 73
    instance-of v10, v6, Lsx4;

    .line 74
    .line 75
    if-nez v10, :cond_6

    .line 76
    .line 77
    :cond_5
    move-object v6, v8

    .line 78
    goto :goto_3

    .line 79
    :cond_6
    iget-object v10, v9, Lql3;->b:Lmz4;

    .line 80
    .line 81
    sget-object v11, Lmz4;->X:Lmz4;

    .line 82
    .line 83
    if-ne v10, v11, :cond_8

    .line 84
    .line 85
    sget-object v10, Lkh8;->X:Lkh8;

    .line 86
    .line 87
    if-ne v1, v10, :cond_8

    .line 88
    .line 89
    move-object v10, v6

    .line 90
    check-cast v10, Lsx4;

    .line 91
    .line 92
    sget-object v11, Lll3;->a:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v10}, Lbl1;->f(Led1;)Lgk2;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    sget-object v12, Lll3;->j:Ljava/util/HashMap;

    .line 99
    .line 100
    invoke-virtual {v12, v11}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    if-eqz v11, :cond_8

    .line 105
    .line 106
    invoke-static {v10}, Lbl1;->f(Led1;)Lgk2;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-virtual {v12, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    check-cast v6, Lfk2;

    .line 115
    .line 116
    if-eqz v6, :cond_7

    .line 117
    .line 118
    invoke-static {v10}, Lel1;->e(Led1;)Lzz3;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    invoke-virtual {v10, v6}, Lzz3;->j(Lfk2;)Lsx4;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    goto :goto_3

    .line 127
    :cond_7
    const-string v0, "Given class "

    .line 128
    .line 129
    const-string v1, " is not a mutable collection"

    .line 130
    .line 131
    invoke-static {v0, v10, v1}, Lio/sentry/c2;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    return-object v8

    .line 135
    :cond_8
    iget-object v10, v9, Lql3;->b:Lmz4;

    .line 136
    .line 137
    sget-object v11, Lmz4;->Y:Lmz4;

    .line 138
    .line 139
    if-ne v10, v11, :cond_5

    .line 140
    .line 141
    sget-object v10, Lkh8;->Y:Lkh8;

    .line 142
    .line 143
    if-ne v1, v10, :cond_5

    .line 144
    .line 145
    check-cast v6, Lsx4;

    .line 146
    .line 147
    sget-object v10, Lll3;->a:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {v6}, Lbl1;->f(Led1;)Lgk2;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    sget-object v11, Lll3;->k:Ljava/util/HashMap;

    .line 154
    .line 155
    invoke-virtual {v11, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    if-eqz v10, :cond_5

    .line 160
    .line 161
    invoke-static {v6}, Lpz2;->h(Lsx4;)Lsx4;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    :goto_3
    const/4 v10, 0x2

    .line 166
    if-eq v1, v5, :cond_a

    .line 167
    .line 168
    iget-object v1, v9, Lql3;->a:Lh75;

    .line 169
    .line 170
    if-nez v1, :cond_9

    .line 171
    .line 172
    const/4 v1, -0x1

    .line 173
    goto :goto_4

    .line 174
    :cond_9
    sget-object v5, Lsh8;->a:[I

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    aget v1, v5, v1

    .line 181
    .line 182
    :goto_4
    if-eq v1, v4, :cond_c

    .line 183
    .line 184
    if-eq v1, v10, :cond_b

    .line 185
    .line 186
    :cond_a
    move-object v1, v8

    .line 187
    goto :goto_5

    .line 188
    :cond_b
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_c
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 192
    .line 193
    :goto_5
    if-eqz v6, :cond_d

    .line 194
    .line 195
    invoke-interface {v6}, Lot0;->l()Llh8;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    if-nez v5, :cond_e

    .line 200
    .line 201
    :cond_d
    invoke-virtual/range {p0 .. p0}, Lt14;->n0()Llh8;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    :cond_e
    add-int/lit8 v11, p2, 0x1

    .line 206
    .line 207
    invoke-virtual/range {p0 .. p0}, Lt14;->l0()Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object v12

    .line 211
    invoke-interface {v5}, Llh8;->g()Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v13

    .line 215
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object v14

    .line 222
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v15

    .line 226
    move/from16 p4, v10

    .line 227
    .line 228
    new-instance v10, Ljava/util/ArrayList;

    .line 229
    .line 230
    const/16 v4, 0xa

    .line 231
    .line 232
    invoke-static {v12, v4}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 233
    .line 234
    .line 235
    move-result v12

    .line 236
    invoke-static {v13, v4}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 237
    .line 238
    .line 239
    move-result v13

    .line 240
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 241
    .line 242
    .line 243
    move-result v12

    .line 244
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 245
    .line 246
    .line 247
    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v12

    .line 251
    if-eqz v12, :cond_15

    .line 252
    .line 253
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v12

    .line 257
    if-eqz v12, :cond_15

    .line 258
    .line 259
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v12

    .line 263
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v13

    .line 267
    check-cast v13, Lhi8;

    .line 268
    .line 269
    check-cast v12, Lni8;

    .line 270
    .line 271
    const/4 v4, 0x6

    .line 272
    if-nez v7, :cond_f

    .line 273
    .line 274
    move-object/from16 v16, v1

    .line 275
    .line 276
    new-instance v1, Lb8;

    .line 277
    .line 278
    invoke-direct {v1, v8, v3, v4}, Lb8;-><init>(Ljava/lang/Object;IB)V

    .line 279
    .line 280
    .line 281
    goto :goto_7

    .line 282
    :cond_f
    move-object/from16 v16, v1

    .line 283
    .line 284
    invoke-virtual {v12}, Lni8;->c()Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-nez v1, :cond_10

    .line 289
    .line 290
    invoke-virtual {v12}, Lni8;->b()Lt14;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-virtual {v1}, Lt14;->q0()Lmo8;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-static {v1, v0, v11, v2}, Lk32;->e(Lmo8;Ld3;IZ)Lb8;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    goto :goto_7

    .line 303
    :cond_10
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-virtual {v0, v1}, Ld3;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Lql3;

    .line 312
    .line 313
    iget-object v1, v1, Lql3;->a:Lh75;

    .line 314
    .line 315
    sget-object v8, Lh75;->X:Lh75;

    .line 316
    .line 317
    if-ne v1, v8, :cond_11

    .line 318
    .line 319
    invoke-virtual {v12}, Lni8;->b()Lt14;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v1}, Lt14;->q0()Lmo8;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    new-instance v8, Lb8;

    .line 328
    .line 329
    invoke-static {v1}, Lyn0;->O(Lt14;)Laa7;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    invoke-virtual {v4, v3}, Laa7;->u0(Z)Laa7;

    .line 334
    .line 335
    .line 336
    move-result-object v4

    .line 337
    invoke-static {v1}, Lyn0;->h0(Lt14;)Laa7;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    const/4 v3, 0x1

    .line 342
    invoke-virtual {v1, v3}, Laa7;->u0(Z)Laa7;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-static {v4, v1}, Ldh3;->s(Laa7;Laa7;)Lmo8;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    const/4 v4, 0x6

    .line 351
    invoke-direct {v8, v1, v3, v4}, Lb8;-><init>(Ljava/lang/Object;IB)V

    .line 352
    .line 353
    .line 354
    move-object v1, v8

    .line 355
    goto :goto_7

    .line 356
    :cond_11
    const/4 v3, 0x1

    .line 357
    new-instance v1, Lb8;

    .line 358
    .line 359
    const/4 v8, 0x0

    .line 360
    invoke-direct {v1, v8, v3, v4}, Lb8;-><init>(Ljava/lang/Object;IB)V

    .line 361
    .line 362
    .line 363
    :goto_7
    iget v3, v1, Lb8;->b:I

    .line 364
    .line 365
    add-int/2addr v11, v3

    .line 366
    iget-object v1, v1, Lb8;->c:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v1, Lt14;

    .line 369
    .line 370
    if-eqz v1, :cond_12

    .line 371
    .line 372
    invoke-virtual {v12}, Lni8;->a()Lrt8;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-static {v1, v3, v13}, Ly08;->b(Lt14;Lrt8;Lhi8;)Lwg7;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    goto :goto_8

    .line 384
    :cond_12
    if-eqz v6, :cond_13

    .line 385
    .line 386
    invoke-virtual {v12}, Lni8;->c()Z

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    if-nez v1, :cond_13

    .line 391
    .line 392
    invoke-virtual {v12}, Lni8;->b()Lt14;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12}, Lni8;->a()Lrt8;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-static {v1, v3, v13}, Ly08;->b(Lt14;Lrt8;Lhi8;)Lwg7;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    goto :goto_8

    .line 411
    :cond_13
    if-eqz v6, :cond_14

    .line 412
    .line 413
    invoke-static {v13}, Lcj8;->j(Lhi8;)Lwg7;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    goto :goto_8

    .line 418
    :cond_14
    const/4 v1, 0x0

    .line 419
    :goto_8
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-object/from16 v1, v16

    .line 423
    .line 424
    const/4 v3, 0x0

    .line 425
    const/16 v4, 0xa

    .line 426
    .line 427
    const/4 v8, 0x0

    .line 428
    goto/16 :goto_6

    .line 429
    .line 430
    :cond_15
    move-object/from16 v16, v1

    .line 431
    .line 432
    sub-int v11, v11, p2

    .line 433
    .line 434
    if-nez v6, :cond_18

    .line 435
    .line 436
    if-nez v16, :cond_18

    .line 437
    .line 438
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-eqz v0, :cond_16

    .line 443
    .line 444
    goto :goto_a

    .line 445
    :cond_16
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 450
    .line 451
    .line 452
    move-result v1

    .line 453
    if-eqz v1, :cond_17

    .line 454
    .line 455
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    check-cast v1, Lni8;

    .line 460
    .line 461
    if-nez v1, :cond_18

    .line 462
    .line 463
    goto :goto_9

    .line 464
    :cond_17
    :goto_a
    new-instance v0, Lfc0;

    .line 465
    .line 466
    const/4 v1, 0x0

    .line 467
    const/4 v8, 0x0

    .line 468
    invoke-direct {v0, v8, v11, v1}, Lfc0;-><init>(Laa7;IZ)V

    .line 469
    .line 470
    .line 471
    return-object v0

    .line 472
    :cond_18
    invoke-virtual/range {p0 .. p0}, Lt14;->getAnnotations()Lsm;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    sget-object v8, Lth8;->b:Lvm;

    .line 477
    .line 478
    if-eqz v6, :cond_19

    .line 479
    .line 480
    goto :goto_b

    .line 481
    :cond_19
    const/4 v8, 0x0

    .line 482
    :goto_b
    sget-object v1, Lth8;->a:Lvm;

    .line 483
    .line 484
    if-eqz v16, :cond_1a

    .line 485
    .line 486
    goto :goto_c

    .line 487
    :cond_1a
    const/4 v1, 0x0

    .line 488
    :goto_c
    const/4 v2, 0x3

    .line 489
    new-array v2, v2, [Lsm;

    .line 490
    .line 491
    const/16 v18, 0x0

    .line 492
    .line 493
    aput-object v0, v2, v18

    .line 494
    .line 495
    const/4 v3, 0x1

    .line 496
    aput-object v8, v2, v3

    .line 497
    .line 498
    aput-object v1, v2, p4

    .line 499
    .line 500
    invoke-static {v2}, Leu;->q0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    if-eqz v1, :cond_21

    .line 509
    .line 510
    if-eq v1, v3, :cond_1b

    .line 511
    .line 512
    new-instance v1, Lvm;

    .line 513
    .line 514
    invoke-static {v0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-direct {v1, v0, v3}, Lvm;-><init>(Ljava/lang/Object;B)V

    .line 519
    .line 520
    .line 521
    goto :goto_d

    .line 522
    :cond_1b
    invoke-static {v0}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    move-object v1, v0

    .line 527
    check-cast v1, Lsm;

    .line 528
    .line 529
    :goto_d
    invoke-static {v1}, Lbt7;->j(Lsm;)Lch8;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-virtual/range {p0 .. p0}, Lt14;->l0()Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    new-instance v6, Ljava/util/ArrayList;

    .line 546
    .line 547
    const/16 v7, 0xa

    .line 548
    .line 549
    invoke-static {v10, v7}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 550
    .line 551
    .line 552
    move-result v8

    .line 553
    invoke-static {v1, v7}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    invoke-static {v8, v1}, Ljava/lang/Math;->min(II)I

    .line 558
    .line 559
    .line 560
    move-result v1

    .line 561
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 562
    .line 563
    .line 564
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 565
    .line 566
    .line 567
    move-result v1

    .line 568
    if-eqz v1, :cond_1d

    .line 569
    .line 570
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 571
    .line 572
    .line 573
    move-result v1

    .line 574
    if-eqz v1, :cond_1d

    .line 575
    .line 576
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v7

    .line 584
    check-cast v7, Lni8;

    .line 585
    .line 586
    check-cast v1, Lni8;

    .line 587
    .line 588
    if-nez v1, :cond_1c

    .line 589
    .line 590
    goto :goto_f

    .line 591
    :cond_1c
    move-object v7, v1

    .line 592
    :goto_f
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    goto :goto_e

    .line 596
    :cond_1d
    if-eqz v16, :cond_1e

    .line 597
    .line 598
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    .line 599
    .line 600
    .line 601
    move-result v1

    .line 602
    goto :goto_10

    .line 603
    :cond_1e
    invoke-virtual/range {p0 .. p0}, Lt14;->o0()Z

    .line 604
    .line 605
    .line 606
    move-result v1

    .line 607
    :goto_10
    invoke-static {v0, v5, v6, v1}, Ldh3;->N(Lch8;Llh8;Ljava/util/List;Z)Laa7;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    iget-boolean v1, v9, Lql3;->c:Z

    .line 612
    .line 613
    if-eqz v1, :cond_1f

    .line 614
    .line 615
    new-instance v1, Lj65;

    .line 616
    .line 617
    invoke-direct {v1, v0}, Lj65;-><init>(Laa7;)V

    .line 618
    .line 619
    .line 620
    move-object v0, v1

    .line 621
    :cond_1f
    if-eqz v16, :cond_20

    .line 622
    .line 623
    iget-boolean v1, v9, Lql3;->d:Z

    .line 624
    .line 625
    if-eqz v1, :cond_20

    .line 626
    .line 627
    goto :goto_11

    .line 628
    :cond_20
    move/from16 v3, v18

    .line 629
    .line 630
    :goto_11
    new-instance v1, Lfc0;

    .line 631
    .line 632
    invoke-direct {v1, v0, v11, v3}, Lfc0;-><init>(Laa7;IZ)V

    .line 633
    .line 634
    .line 635
    return-object v1

    .line 636
    :cond_21
    const-string v0, "At least one Annotations object expected"

    .line 637
    .line 638
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    const/16 v17, 0x0

    .line 642
    .line 643
    return-object v17
.end method

.method public static e(Lmo8;Ld3;IZ)Lb8;
    .locals 10

    .line 1
    invoke-static {p0}, Lvr3;->J(Lt14;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x6

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p0, Lb8;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, v2, p1, v1}, Lb8;-><init>(Ljava/lang/Object;IB)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Lce2;

    .line 17
    .line 18
    if-eqz v0, :cond_b

    .line 19
    .line 20
    instance-of v7, p0, Lr66;

    .line 21
    .line 22
    move-object v0, p0

    .line 23
    check-cast v0, Lce2;

    .line 24
    .line 25
    iget-object v9, v0, Lce2;->Z:Laa7;

    .line 26
    .line 27
    iget-object v3, v0, Lce2;->Y:Laa7;

    .line 28
    .line 29
    sget-object v6, Lkh8;->X:Lkh8;

    .line 30
    .line 31
    move-object v4, p1

    .line 32
    move v5, p2

    .line 33
    move v8, p3

    .line 34
    invoke-static/range {v3 .. v8}, Lk32;->c(Laa7;Ld3;ILkh8;ZZ)Lfc0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    move-object p2, v3

    .line 39
    iget-object v3, v0, Lce2;->Z:Laa7;

    .line 40
    .line 41
    sget-object v6, Lkh8;->Y:Lkh8;

    .line 42
    .line 43
    invoke-static/range {v3 .. v8}, Lk32;->c(Laa7;Ld3;ILkh8;ZZ)Lfc0;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    iget-object v0, p3, Lfc0;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Laa7;

    .line 50
    .line 51
    iget-object v3, p1, Lfc0;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, Laa7;

    .line 54
    .line 55
    if-nez v3, :cond_1

    .line 56
    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_1
    iget-boolean v2, p1, Lfc0;->b:Z

    .line 61
    .line 62
    if-nez v2, :cond_8

    .line 63
    .line 64
    iget-boolean p3, p3, Lfc0;->b:Z

    .line 65
    .line 66
    if-eqz p3, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    if-eqz v7, :cond_5

    .line 70
    .line 71
    new-instance v2, Lr66;

    .line 72
    .line 73
    if-nez v3, :cond_3

    .line 74
    .line 75
    move-object v3, p2

    .line 76
    :cond_3
    if-nez v0, :cond_4

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    move-object v9, v0

    .line 80
    :goto_0
    invoke-direct {v2, v3, v9}, Lr66;-><init>(Laa7;Laa7;)V

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_5
    if-nez v3, :cond_6

    .line 85
    .line 86
    move-object v3, p2

    .line 87
    :cond_6
    if-nez v0, :cond_7

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_7
    move-object v9, v0

    .line 91
    :goto_1
    invoke-static {v3, v9}, Ldh3;->s(Laa7;Laa7;)Lmo8;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    goto :goto_4

    .line 96
    :cond_8
    :goto_2
    if-eqz v0, :cond_a

    .line 97
    .line 98
    if-nez v3, :cond_9

    .line 99
    .line 100
    move-object v3, v0

    .line 101
    :cond_9
    invoke-static {v3, v0}, Ldh3;->s(Laa7;Laa7;)Lmo8;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    goto :goto_3

    .line 106
    :cond_a
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    :goto_3
    invoke-static {p0, v3}, Lc18;->h(Lmo8;Lt14;)Lmo8;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    :goto_4
    new-instance p0, Lb8;

    .line 114
    .line 115
    iget p1, p1, Lfc0;->a:I

    .line 116
    .line 117
    invoke-direct {p0, v2, p1, v1}, Lb8;-><init>(Ljava/lang/Object;IB)V

    .line 118
    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_b
    move-object v4, p1

    .line 122
    move v5, p2

    .line 123
    move v8, p3

    .line 124
    instance-of p1, p0, Laa7;

    .line 125
    .line 126
    if-eqz p1, :cond_d

    .line 127
    .line 128
    move-object v3, p0

    .line 129
    check-cast v3, Laa7;

    .line 130
    .line 131
    sget-object v6, Lkh8;->Z:Lkh8;

    .line 132
    .line 133
    const/4 v7, 0x0

    .line 134
    invoke-static/range {v3 .. v8}, Lk32;->c(Laa7;Ld3;ILkh8;ZZ)Lfc0;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    new-instance p2, Lb8;

    .line 139
    .line 140
    iget-boolean p3, p1, Lfc0;->b:Z

    .line 141
    .line 142
    iget-object v0, p1, Lfc0;->c:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, Laa7;

    .line 145
    .line 146
    if-eqz p3, :cond_c

    .line 147
    .line 148
    invoke-static {p0, v0}, Lc18;->h(Lmo8;Lt14;)Lmo8;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    :cond_c
    iget p0, p1, Lfc0;->a:I

    .line 153
    .line 154
    invoke-direct {p2, v0, p0, v1}, Lb8;-><init>(Ljava/lang/Object;IB)V

    .line 155
    .line 156
    .line 157
    return-object p2

    .line 158
    :cond_d
    invoke-static {}, Lb61;->c()V

    .line 159
    .line 160
    .line 161
    return-object v2
.end method

.method public static g(I)Laj2;
    .locals 1

    .line 1
    sget-object v0, Laj2;->f0:Ln22;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Laj2;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Laj2;->Y:Laj2;

    .line 12
    .line 13
    :cond_0
    return-object p0
.end method

.method public static i()Lsu/happ/proxyutility/HappApplication;
    .locals 1

    .line 1
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "application"

    .line 7
    .line 8
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public static j(Ljava/lang/String;II)Z
    .locals 2

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    if-ge v0, p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/16 v1, 0x25

    .line 10
    .line 11
    if-ne p2, v1, :cond_0

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    add-int/2addr p1, p2

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p1}, Lks8;->p(C)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v1, -0x1

    .line 24
    if-eq p1, v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Lks8;->p(C)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eq p0, v1, :cond_0

    .line 35
    .line 36
    return p2

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static k(Ljava/lang/String;III)Ljava/lang/String;
    .locals 8

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p3, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    :cond_1
    and-int/lit8 p3, p3, 0x4

    .line 16
    .line 17
    if-eqz p3, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    const/4 v1, 0x1

    .line 21
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move p3, p1

    .line 25
    :goto_1
    if-ge p3, p2, :cond_8

    .line 26
    .line 27
    invoke-virtual {p0, p3}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/16 v2, 0x2b

    .line 32
    .line 33
    const/16 v3, 0x25

    .line 34
    .line 35
    if-eq v0, v3, :cond_4

    .line 36
    .line 37
    if-ne v0, v2, :cond_3

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    add-int/lit8 p3, p3, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_4
    :goto_2
    new-instance v0, Li90;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1, p3, p0}, Li90;->c1(IILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :goto_3
    if-ge p3, p2, :cond_7

    .line 54
    .line 55
    invoke-virtual {p0, p3}, Ljava/lang/String;->codePointAt(I)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-ne p1, v3, :cond_5

    .line 60
    .line 61
    add-int/lit8 v4, p3, 0x2

    .line 62
    .line 63
    if-ge v4, p2, :cond_5

    .line 64
    .line 65
    add-int/lit8 v5, p3, 0x1

    .line 66
    .line 67
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    invoke-static {v5}, Lks8;->p(C)I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    invoke-static {v6}, Lks8;->p(C)I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    const/4 v7, -0x1

    .line 84
    if-eq v5, v7, :cond_6

    .line 85
    .line 86
    if-eq v6, v7, :cond_6

    .line 87
    .line 88
    shl-int/lit8 p3, v5, 0x4

    .line 89
    .line 90
    add-int/2addr p3, v6

    .line 91
    invoke-virtual {v0, p3}, Li90;->H0(I)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, Ljava/lang/Character;->charCount(I)I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    add-int p3, p1, v4

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_5
    if-ne p1, v2, :cond_6

    .line 102
    .line 103
    if-eqz v1, :cond_6

    .line 104
    .line 105
    const/16 p1, 0x20

    .line 106
    .line 107
    invoke-virtual {v0, p1}, Li90;->H0(I)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 p3, p3, 0x1

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_6
    invoke-virtual {v0, p1}, Li90;->e1(I)V

    .line 114
    .line 115
    .line 116
    invoke-static {p1}, Ljava/lang/Character;->charCount(I)I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    add-int/2addr p3, p1

    .line 121
    goto :goto_3

    .line 122
    :cond_7
    invoke-virtual {v0}, Li90;->Y()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0

    .line 127
    :cond_8
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0
.end method

.method public static l(Landroid/widget/TextView;)V
    .locals 3

    .line 1
    sget-object v0, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;->o0:Lvz7;

    .line 2
    .line 3
    :goto_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    sub-int/2addr v1, v2

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    sub-int/2addr v1, v2

    .line 33
    int-to-float v1, v1

    .line 34
    cmpg-float v0, v0, v1

    .line 35
    .line 36
    if-gtz v0, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v0, v1}, Ld28;->f(FLandroid/util/DisplayMetrics;)F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/high16 v1, 0x41000000    # 8.0f

    .line 56
    .line 57
    cmpl-float v0, v0, v1

    .line 58
    .line 59
    if-lez v0, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-static {v0, v1}, Ld28;->f(FLandroid/util/DisplayMetrics;)F

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    const/high16 v1, 0x3f800000    # 1.0f

    .line 78
    .line 79
    sub-float/2addr v0, v1

    .line 80
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    :goto_1
    return-void
.end method

.method public static m(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-gt v1, v2, :cond_3

    .line 12
    .line 13
    const/16 v2, 0x26

    .line 14
    .line 15
    const/4 v3, 0x4

    .line 16
    invoke-static {p0, v2, v1, v3}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :cond_0
    const/16 v5, 0x3d

    .line 28
    .line 29
    invoke-static {p0, v5, v1, v3}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eq v3, v4, :cond_2

    .line 34
    .line 35
    if-le v3, v2, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    :goto_1
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :goto_2
    add-int/lit8 v1, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    return-object v0
.end method


# virtual methods
.method public a()Lte3;
    .locals 2

    .line 1
    invoke-static {}, Lj$/time/Instant;->now()Lj$/time/Instant;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Lte3;->Z:Lte3;

    .line 9
    .line 10
    invoke-virtual {p0}, Lj$/time/Instant;->getEpochSecond()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-virtual {p0}, Lj$/time/Instant;->getNano()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-static {p0, v0, v1}, Lkm4;->F(IJ)Lte3;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method

.method public d(Landroidx/preference/Preference;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    check-cast p1, Landroidx/preference/ListPreference;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/preference/ListPreference;->d()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    iget-object p0, p1, Landroidx/preference/Preference;->X:Landroid/content/Context;

    .line 14
    .line 15
    sget p1, Ld56;->not_set:I

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-virtual {p1}, Landroidx/preference/ListPreference;->d()Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public f(Lyw7;)Lax7;
    .locals 6

    .line 1
    new-instance v0, Lxm2;

    .line 2
    .line 3
    iget-object v1, p1, Lyw7;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p1, Lyw7;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p1, Lyw7;->c:Lb8;

    .line 8
    .line 9
    iget-boolean v4, p1, Lyw7;->d:Z

    .line 10
    .line 11
    iget-boolean v5, p1, Lyw7;->e:Z

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lxm2;-><init>(Landroid/content/Context;Ljava/lang/String;Lb8;ZZ)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public h([B)Z
    .locals 2

    .line 1
    const/4 p0, 0x0

    .line 2
    aget-byte v0, p1, p0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    aget-byte p1, p1, v1

    .line 8
    .line 9
    and-int/lit16 p1, p1, 0xff

    .line 10
    .line 11
    if-ge p1, v1, :cond_1

    .line 12
    .line 13
    :cond_0
    const/4 p1, 0x2

    .line 14
    if-gt p1, v0, :cond_2

    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    if-gt v0, p1, :cond_2

    .line 18
    .line 19
    :cond_1
    return v1

    .line 20
    :cond_2
    return p0
.end method

.method public t(Lsx4;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    return-void
.end method

.method public z(Lld0;)V
    .locals 0

    .line 1
    return-void
.end method
