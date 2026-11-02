.class public final Lem;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lwd0;


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lcm;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/util/ArrayList;Lcm;)V
    .locals 6

    .line 173
    new-instance v5, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 174
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 175
    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    .line 176
    invoke-virtual {p1, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 177
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 178
    :cond_0
    sget-object v4, Ldm;->Y:Ldm;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lem;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;Lcm;Ldm;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/util/ArrayList;Lcm;Ldm;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lem;->a:Ljava/lang/Class;

    .line 11
    .line 12
    iput-object p2, p0, Lem;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    iput-object p3, p0, Lem;->c:Lcm;

    .line 15
    .line 16
    iput-object p5, p0, Lem;->d:Ljava/util/List;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 p2, 0xa

    .line 21
    .line 22
    invoke-static {p5, p2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p5

    .line 37
    if-eqz p5, :cond_0

    .line 38
    .line 39
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p5

    .line 43
    check-cast p5, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    invoke-virtual {p5}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 46
    .line 47
    .line 48
    move-result-object p5

    .line 49
    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iput-object p1, p0, Lem;->e:Ljava/util/ArrayList;

    .line 54
    .line 55
    iget-object p1, p0, Lem;->d:Ljava/util/List;

    .line 56
    .line 57
    new-instance p3, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-static {p1, p2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 60
    .line 61
    .line 62
    move-result p5

    .line 63
    invoke-direct {p3, p5}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result p5

    .line 74
    if-eqz p5, :cond_2

    .line 75
    .line 76
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p5

    .line 80
    check-cast p5, Ljava/lang/reflect/Method;

    .line 81
    .line 82
    invoke-virtual {p5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object p5

    .line 86
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-static {p5}, Lia6;->e(Ljava/lang/Class;)Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-nez v0, :cond_1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_1
    move-object p5, v0

    .line 97
    :goto_2
    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    iput-object p3, p0, Lem;->f:Ljava/util/ArrayList;

    .line 102
    .line 103
    iget-object p1, p0, Lem;->d:Ljava/util/List;

    .line 104
    .line 105
    new-instance p3, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-static {p1, p2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    invoke-direct {p3, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-eqz p2, :cond_3

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    check-cast p2, Ljava/lang/reflect/Method;

    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_3
    iput-object p3, p0, Lem;->g:Ljava/util/ArrayList;

    .line 139
    .line 140
    iget-object p1, p0, Lem;->c:Lcm;

    .line 141
    .line 142
    sget-object p2, Lcm;->Y:Lcm;

    .line 143
    .line 144
    if-ne p1, p2, :cond_5

    .line 145
    .line 146
    sget-object p1, Ldm;->X:Ldm;

    .line 147
    .line 148
    if-ne p4, p1, :cond_5

    .line 149
    .line 150
    iget-object p0, p0, Lem;->b:Ljava/util/ArrayList;

    .line 151
    .line 152
    const-string p1, "value"

    .line 153
    .line 154
    invoke-static {p0, p1}, Lwv0;->D0(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-eqz p0, :cond_4

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_4
    const-string p0, "Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead."

    .line 166
    .line 167
    invoke-static {p0}, Lu52;->k(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const/4 p0, 0x0

    .line 171
    throw p0

    .line 172
    :cond_5
    :goto_4
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lem;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final d([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    iget-object v3, v0, Lem;->e:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    if-ne v4, v2, :cond_d

    .line 13
    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    array-length v3, v1

    .line 17
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    array-length v3, v1

    .line 21
    const/4 v4, 0x0

    .line 22
    move v6, v4

    .line 23
    move v7, v6

    .line 24
    :goto_0
    iget-object v8, v0, Lem;->b:Ljava/util/ArrayList;

    .line 25
    .line 26
    if-ge v6, v3, :cond_c

    .line 27
    .line 28
    aget-object v9, v1, v6

    .line 29
    .line 30
    add-int/lit8 v10, v7, 0x1

    .line 31
    .line 32
    iget-object v11, v0, Lem;->f:Ljava/util/ArrayList;

    .line 33
    .line 34
    if-nez v9, :cond_0

    .line 35
    .line 36
    iget-object v12, v0, Lem;->c:Lcm;

    .line 37
    .line 38
    sget-object v13, Lcm;->X:Lcm;

    .line 39
    .line 40
    if-ne v12, v13, :cond_0

    .line 41
    .line 42
    iget-object v9, v0, Lem;->g:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    :goto_1
    const/16 v17, 0x0

    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_0
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    check-cast v12, Ljava/lang/Class;

    .line 56
    .line 57
    instance-of v13, v9, Ljava/lang/Class;

    .line 58
    .line 59
    if-eqz v13, :cond_1

    .line 60
    .line 61
    :goto_2
    const/4 v9, 0x0

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    instance-of v13, v9, Lzu3;

    .line 64
    .line 65
    if-eqz v13, :cond_3

    .line 66
    .line 67
    check-cast v9, Lzu3;

    .line 68
    .line 69
    invoke-static {v9}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    :cond_2
    const/16 v17, 0x0

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_3
    instance-of v13, v9, [Ljava/lang/Object;

    .line 77
    .line 78
    if-eqz v13, :cond_2

    .line 79
    .line 80
    move-object v13, v9

    .line 81
    check-cast v13, [Ljava/lang/Object;

    .line 82
    .line 83
    instance-of v14, v13, [Ljava/lang/Class;

    .line 84
    .line 85
    if-eqz v14, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    instance-of v14, v13, [Lzu3;

    .line 89
    .line 90
    if-eqz v14, :cond_6

    .line 91
    .line 92
    check-cast v9, [Lzu3;

    .line 93
    .line 94
    new-instance v13, Ljava/util/ArrayList;

    .line 95
    .line 96
    array-length v14, v9

    .line 97
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 98
    .line 99
    .line 100
    array-length v14, v9

    .line 101
    move v15, v4

    .line 102
    :goto_3
    if-ge v15, v14, :cond_5

    .line 103
    .line 104
    aget-object v16, v9, v15

    .line 105
    .line 106
    const/16 v17, 0x0

    .line 107
    .line 108
    invoke-static/range {v16 .. v16}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    add-int/lit8 v15, v15, 0x1

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    const/16 v17, 0x0

    .line 119
    .line 120
    new-array v5, v4, [Ljava/lang/Class;

    .line 121
    .line 122
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    goto :goto_4

    .line 127
    :cond_6
    const/16 v17, 0x0

    .line 128
    .line 129
    move-object v9, v13

    .line 130
    :goto_4
    invoke-virtual {v12, v9}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_7

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_7
    move-object/from16 v9, v17

    .line 138
    .line 139
    :goto_5
    if-nez v9, :cond_b

    .line 140
    .line 141
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, Ljava/lang/Class;

    .line 152
    .line 153
    const-class v2, Ljava/lang/Class;

    .line 154
    .line 155
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_8

    .line 160
    .line 161
    sget-object v1, Lyb6;->a:Lzb6;

    .line 162
    .line 163
    const-class v2, Lzu3;

    .line 164
    .line 165
    invoke-virtual {v1, v2}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    goto :goto_6

    .line 170
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_9

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-static {v3, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-eqz v2, :cond_9

    .line 185
    .line 186
    sget-object v1, Lyb6;->a:Lzb6;

    .line 187
    .line 188
    const-class v2, [Lzu3;

    .line 189
    .line 190
    invoke-virtual {v1, v2}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    goto :goto_6

    .line 195
    :cond_9
    sget-object v2, Lyb6;->a:Lzb6;

    .line 196
    .line 197
    invoke-virtual {v2, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    move-object/from16 v18, v2

    .line 202
    .line 203
    move-object v2, v1

    .line 204
    move-object/from16 v1, v18

    .line 205
    .line 206
    :goto_6
    invoke-interface {v2}, Lzu3;->p()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    const-class v4, [Ljava/lang/Object;

    .line 211
    .line 212
    invoke-virtual {v1, v4}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-interface {v4}, Lzu3;->p()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    invoke-static {v3, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-eqz v3, :cond_a

    .line 225
    .line 226
    new-instance v3, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-interface {v2}, Lzu3;->p()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const/16 v4, 0x3c

    .line 239
    .line 240
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-static {v2}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v2}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-interface {v1}, Lzu3;->p()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const/16 v1, 0x3e

    .line 266
    .line 267
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    goto :goto_7

    .line 275
    :cond_a
    invoke-interface {v2}, Lzu3;->p()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    :goto_7
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 280
    .line 281
    new-instance v3, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    const-string v4, "Argument #"

    .line 284
    .line 285
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    const/16 v4, 0x20

    .line 292
    .line 293
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    const-string v0, " is not of the required type "

    .line 300
    .line 301
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v2

    .line 315
    :cond_b
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    add-int/lit8 v6, v6, 0x1

    .line 319
    .line 320
    move v7, v10

    .line 321
    goto/16 :goto_0

    .line 322
    .line 323
    :cond_c
    invoke-static {v8, v2}, Lwv0;->e1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-static {v1}, Lzp4;->P(Ljava/util/List;)Ljava/util/Map;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    iget-object v2, v0, Lem;->d:Ljava/util/List;

    .line 332
    .line 333
    iget-object v0, v0, Lem;->a:Ljava/lang/Class;

    .line 334
    .line 335
    invoke-static {v0, v1, v2}, Lw39;->p(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    return-object v0

    .line 340
    :cond_d
    const/16 v17, 0x0

    .line 341
    .line 342
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    invoke-static {v0, v2}, Lbt;->d(II)V

    .line 347
    .line 348
    .line 349
    return-object v17
.end method

.method public final j()Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lem;->a:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method
