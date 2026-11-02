.class public abstract Lf54;
.super Lft4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic m:[Lnw3;


# instance fields
.field public final b:Lz47;

.field public final c:Lf54;

.field public final d:Lne4;

.field public final e:Lte4;

.field public final f:Lpe4;

.field public final g:Lvt1;

.field public final h:Lpe4;

.field public final i:Lte4;

.field public final j:Lte4;

.field public final k:Lte4;

.field public final l:Lpe4;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Llx5;

    .line 2
    .line 3
    const-class v1, Lf54;

    .line 4
    .line 5
    const-string v2, "functionNamesLazy"

    .line 6
    .line 7
    const-string v3, "getFunctionNamesLazy()Ljava/util/Set;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Llx5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Llx5;

    .line 14
    .line 15
    const-string v3, "propertyNamesLazy"

    .line 16
    .line 17
    const-string v5, "getPropertyNamesLazy()Ljava/util/Set;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, Llx5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Llx5;

    .line 23
    .line 24
    const-string v5, "classNamesLazy"

    .line 25
    .line 26
    const-string v6, "getClassNamesLazy()Ljava/util/Set;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, Llx5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [Lnw3;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, Lf54;->m:[Lnw3;

    .line 43
    .line 44
    return-void
.end method

.method public constructor <init>(Lz47;Lt44;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lf54;->b:Lz47;

    .line 8
    .line 9
    iput-object p2, p0, Lf54;->c:Lf54;

    .line 10
    .line 11
    iget-object p1, p1, Lz47;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lc6;

    .line 14
    .line 15
    iget-object p1, p1, Lc6;->f0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lve4;

    .line 18
    .line 19
    new-instance p2, Lc54;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p2, p0, v0}, Lc54;-><init>(Lf54;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lne4;

    .line 26
    .line 27
    invoke-direct {v1, p1, p2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lf54;->d:Lne4;

    .line 31
    .line 32
    new-instance p2, Lc54;

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-direct {p2, p0, v1}, Lc54;-><init>(Lf54;B)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lte4;

    .line 39
    .line 40
    invoke-direct {v2, p1, p2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, Lf54;->e:Lte4;

    .line 44
    .line 45
    new-instance p2, Ld54;

    .line 46
    .line 47
    invoke-direct {p2, p0, v0}, Ld54;-><init>(Lf54;B)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2}, Lve4;->b(Lgn2;)Lpe4;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iput-object p2, p0, Lf54;->f:Lpe4;

    .line 55
    .line 56
    new-instance p2, Ld54;

    .line 57
    .line 58
    invoke-direct {p2, p0, v1}, Ld54;-><init>(Lf54;B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2}, Lve4;->c(Lgn2;)Lvt1;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    iput-object p2, p0, Lf54;->g:Lvt1;

    .line 66
    .line 67
    new-instance p2, Ld54;

    .line 68
    .line 69
    const/4 v0, 0x2

    .line 70
    invoke-direct {p2, p0, v0}, Ld54;-><init>(Lf54;B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p2}, Lve4;->b(Lgn2;)Lpe4;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iput-object p2, p0, Lf54;->h:Lpe4;

    .line 78
    .line 79
    new-instance p2, Lc54;

    .line 80
    .line 81
    invoke-direct {p2, p0, v0}, Lc54;-><init>(Lf54;B)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Lte4;

    .line 85
    .line 86
    invoke-direct {v0, p1, p2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lf54;->i:Lte4;

    .line 90
    .line 91
    new-instance p2, Lc54;

    .line 92
    .line 93
    const/4 v0, 0x3

    .line 94
    invoke-direct {p2, p0, v0}, Lc54;-><init>(Lf54;B)V

    .line 95
    .line 96
    .line 97
    new-instance v1, Lte4;

    .line 98
    .line 99
    invoke-direct {v1, p1, p2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 100
    .line 101
    .line 102
    iput-object v1, p0, Lf54;->j:Lte4;

    .line 103
    .line 104
    new-instance p2, Lc54;

    .line 105
    .line 106
    const/4 v1, 0x4

    .line 107
    invoke-direct {p2, p0, v1}, Lc54;-><init>(Lf54;B)V

    .line 108
    .line 109
    .line 110
    new-instance v1, Lte4;

    .line 111
    .line 112
    invoke-direct {v1, p1, p2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 113
    .line 114
    .line 115
    iput-object v1, p0, Lf54;->k:Lte4;

    .line 116
    .line 117
    new-instance p2, Ld54;

    .line 118
    .line 119
    invoke-direct {p2, p0, v0}, Ld54;-><init>(Lf54;B)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, p2}, Lve4;->b(Lgn2;)Lpe4;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object p1, p0, Lf54;->l:Lpe4;

    .line 127
    .line 128
    return-void
.end method

.method public static l(Lcb6;Lz47;)Lt14;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcb6;->b()Ljava/lang/reflect/Member;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/reflect/Method;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x6

    .line 23
    sget-object v3, Lzi8;->Y:Lzi8;

    .line 24
    .line 25
    invoke-static {v3, v0, v1, v2}, Lpu;->U(Lzi8;ZLj54;I)Lnl3;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object p1, p1, Lz47;->g0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lf63;

    .line 32
    .line 33
    invoke-virtual {p0}, Lcb6;->f()Lgb6;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p1, p0, v0}, Lf63;->C(Lgb6;Lnl3;)Lt14;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static u(Lz47;Ljo2;Ljava/util/List;)Lfj2;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lz47;->g0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lf63;

    .line 6
    .line 7
    iget-object v2, v0, Lz47;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lc6;

    .line 10
    .line 11
    iget-object v2, v2, Lc6;->n0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lwx4;

    .line 14
    .line 15
    invoke-static/range {p2 .. p2}, Lwv0;->d1(Ljava/lang/Iterable;)Lgu;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    new-instance v4, Ljava/util/ArrayList;

    .line 20
    .line 21
    const/16 v5, 0xa

    .line 22
    .line 23
    invoke-static {v3, v5}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Lgu;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const/4 v5, 0x0

    .line 35
    move v6, v5

    .line 36
    :goto_0
    move-object v7, v3

    .line 37
    check-cast v7, Lrw1;

    .line 38
    .line 39
    iget-object v8, v7, Lrw1;->Y:Ljava/util/Iterator;

    .line 40
    .line 41
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-eqz v8, :cond_7

    .line 46
    .line 47
    invoke-virtual {v7}, Lrw1;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    check-cast v7, Lpb3;

    .line 52
    .line 53
    iget v11, v7, Lpb3;->a:I

    .line 54
    .line 55
    iget-object v7, v7, Lpb3;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v7, Lib6;

    .line 58
    .line 59
    invoke-static {v0, v7}, Lhi5;->w0(Lz47;Lvj3;)Ln44;

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    sget-object v8, Lzi8;->Y:Lzi8;

    .line 64
    .line 65
    const/4 v9, 0x7

    .line 66
    const/4 v10, 0x0

    .line 67
    invoke-static {v8, v5, v10, v9}, Lpu;->U(Lzi8;ZLj54;I)Lnl3;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    iget-boolean v9, v7, Lib6;->d:Z

    .line 72
    .line 73
    iget-object v13, v7, Lib6;->a:Lgb6;

    .line 74
    .line 75
    const/4 v14, 0x1

    .line 76
    if-eqz v9, :cond_2

    .line 77
    .line 78
    instance-of v9, v13, Lna6;

    .line 79
    .line 80
    if-eqz v9, :cond_0

    .line 81
    .line 82
    check-cast v13, Lna6;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_0
    move-object v13, v10

    .line 86
    :goto_1
    if-eqz v13, :cond_1

    .line 87
    .line 88
    invoke-virtual {v1, v13, v8, v14}, Lf63;->B(Lna6;Lnl3;Z)Lmo8;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    iget-object v9, v2, Lwx4;->h0:Lzz3;

    .line 93
    .line 94
    invoke-virtual {v9, v8}, Lzz3;->f(Lt14;)Lt14;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    new-instance v13, Lqg5;

    .line 99
    .line 100
    invoke-direct {v13, v8, v9}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 105
    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v2, "Vararg parameter should be an array: "

    .line 109
    .line 110
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    throw v0

    .line 124
    :cond_2
    invoke-virtual {v1, v13, v8}, Lf63;->C(Lgb6;Lnl3;)Lt14;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    new-instance v13, Lqg5;

    .line 129
    .line 130
    invoke-direct {v13, v8, v10}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :goto_2
    iget-object v8, v13, Lqg5;->X:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v8, Lt14;

    .line 136
    .line 137
    iget-object v9, v13, Lqg5;->Y:Ljava/lang/Object;

    .line 138
    .line 139
    move-object/from16 v18, v9

    .line 140
    .line 141
    check-cast v18, Lt14;

    .line 142
    .line 143
    invoke-virtual/range {p1 .. p1}, Lfd1;->getName()Lv15;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    invoke-virtual {v9}, Lv15;->b()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    const-string v13, "equals"

    .line 152
    .line 153
    invoke-static {v9, v13}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    if-eqz v9, :cond_3

    .line 158
    .line 159
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    if-ne v9, v14, :cond_3

    .line 164
    .line 165
    iget-object v9, v2, Lwx4;->h0:Lzz3;

    .line 166
    .line 167
    invoke-virtual {v9}, Lzz3;->p()Laa7;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    invoke-virtual {v9, v8}, Lt14;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    if-eqz v9, :cond_3

    .line 176
    .line 177
    const-string v9, "other"

    .line 178
    .line 179
    invoke-static {v9}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    :goto_3
    move-object v14, v8

    .line 184
    move-object v13, v9

    .line 185
    goto :goto_4

    .line 186
    :cond_3
    iget-object v9, v7, Lib6;->c:Ljava/lang/String;

    .line 187
    .line 188
    if-eqz v9, :cond_4

    .line 189
    .line 190
    invoke-static {v9}, Lv15;->d(Ljava/lang/String;)Lv15;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    :cond_4
    if-nez v10, :cond_5

    .line 195
    .line 196
    move v6, v14

    .line 197
    :cond_5
    if-nez v10, :cond_6

    .line 198
    .line 199
    new-instance v9, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    const-string v10, "p"

    .line 202
    .line 203
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    invoke-static {v9}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    goto :goto_3

    .line 218
    :cond_6
    move-object v14, v8

    .line 219
    move-object v13, v10

    .line 220
    :goto_4
    new-instance v8, Lot8;

    .line 221
    .line 222
    const/16 v17, 0x0

    .line 223
    .line 224
    invoke-static {v7}, Llh4;->Z0(Lfk3;)Lhr6;

    .line 225
    .line 226
    .line 227
    move-result-object v19

    .line 228
    const/4 v10, 0x0

    .line 229
    const/4 v15, 0x0

    .line 230
    const/16 v16, 0x0

    .line 231
    .line 232
    move-object/from16 v9, p1

    .line 233
    .line 234
    invoke-direct/range {v8 .. v19}, Lot8;-><init>(Ljd0;Lot8;ILsm;Lv15;Lt14;ZZZLt14;Lke7;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :cond_7
    invoke-static {v4}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    new-instance v1, Lfj2;

    .line 247
    .line 248
    invoke-direct {v1, v0, v6}, Lfj2;-><init>(Ljava/util/List;Z)V

    .line 249
    .line 250
    .line 251
    return-object v1
.end method


# virtual methods
.method public a(Lpk1;Lgn2;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lf54;->d:Lne4;

    .line 5
    .line 6
    invoke-virtual {p0}, Lte4;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/util/Collection;

    .line 11
    .line 12
    return-object p0
.end method

.method public b(Lv15;Lx45;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lf54;->c()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    sget-object p0, Ld02;->X:Ld02;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    iget-object p0, p0, Lf54;->h:Lpe4;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lpe4;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/util/Collection;

    .line 27
    .line 28
    return-object p0
.end method

.method public final c()Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Lf54;->m:[Lnw3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lf54;->i:Lte4;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/Set;

    .line 13
    .line 14
    return-object p0
.end method

.method public final d()Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Lf54;->m:[Lnw3;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lf54;->k:Lte4;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/Set;

    .line 13
    .line 14
    return-object p0
.end method

.method public f(Lv15;Lx45;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lf54;->g()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    sget-object p0, Ld02;->X:Ld02;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    iget-object p0, p0, Lf54;->l:Lpe4;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lpe4;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/util/Collection;

    .line 24
    .line 25
    return-object p0
.end method

.method public final g()Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Lf54;->m:[Lnw3;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lf54;->j:Lte4;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/Set;

    .line 13
    .line 14
    return-object p0
.end method

.method public h(Lpk1;Lgn2;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lm02;->X:Lm02;

    .line 5
    .line 6
    return-object p0
.end method

.method public i(Lpk1;Lgn2;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lm02;->X:Lm02;

    .line 5
    .line 6
    return-object p0
.end method

.method public j(Lv15;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    return-void
.end method

.method public k()Lld1;
    .locals 0

    .line 1
    sget-object p0, Lkd1;->a:Lkd1;

    .line 2
    .line 3
    return-object p0
.end method

.method public m(Ljava/util/LinkedHashSet;Lv15;)V
    .locals 0

    .line 1
    return-void
.end method

.method public n(Lv15;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    return-void
.end method

.method public o(Lpk1;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lm02;->X:Lm02;

    .line 5
    .line 6
    return-object p0
.end method

.method public p()Li44;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public abstract q()Led1;
.end method

.method public r(Ldl3;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public s(Lcb6;Ljava/util/ArrayList;Lt14;Ljava/util/List;)Le54;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Le54;

    .line 5
    .line 6
    sget-object p1, Ld02;->X:Ld02;

    .line 7
    .line 8
    invoke-direct {p0, p3, p4, p2, p1}, Le54;-><init>(Lt14;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final t(Lcb6;)Ldl3;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lf54;->b:Lz47;

    .line 9
    .line 10
    invoke-static {v2, v1}, Lhi5;->w0(Lz47;Lvj3;)Ln44;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v0}, Lf54;->q()Led1;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v1}, Lbb6;->c()Lv15;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-static {v1}, Llh4;->Z0(Lfk3;)Lhr6;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    iget-object v7, v0, Lf54;->e:Lte4;

    .line 27
    .line 28
    invoke-virtual {v7}, Lte4;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    check-cast v7, Lld1;

    .line 33
    .line 34
    invoke-virtual {v1}, Lbb6;->c()Lv15;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-interface {v7, v8}, Lld1;->b(Lv15;)Lfb6;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    const/4 v8, 0x0

    .line 43
    if-eqz v7, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1}, Lcb6;->g()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    check-cast v7, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_0

    .line 56
    .line 57
    const/4 v7, 0x1

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v7, v8

    .line 60
    :goto_0
    invoke-static {v4, v3, v5, v6, v7}, Ldl3;->V0(Led1;Ln44;Lv15;Lhr6;Z)Ldl3;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v3, v2, Lz47;->f0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, Lg44;

    .line 70
    .line 71
    iget-object v4, v2, Lz47;->Y:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v4, Lc6;

    .line 74
    .line 75
    new-instance v5, Lxm0;

    .line 76
    .line 77
    invoke-direct {v5, v2, v9, v1, v8}, Lxm0;-><init>(Lz47;Led1;Lpl3;I)V

    .line 78
    .line 79
    .line 80
    new-instance v2, Lz47;

    .line 81
    .line 82
    invoke-direct {v2, v4, v5, v3}, Lz47;-><init>(Lc6;Lki8;Lg44;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Lcb6;->getTypeParameters()Ljava/util/ArrayList;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    new-instance v4, Ljava/util/ArrayList;

    .line 90
    .line 91
    const/16 v5, 0xa

    .line 92
    .line 93
    invoke-static {v3, v5}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-eqz v5, :cond_1

    .line 109
    .line 110
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    check-cast v5, Lhb6;

    .line 115
    .line 116
    iget-object v6, v2, Lz47;->Z:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v6, Lki8;

    .line 119
    .line 120
    invoke-interface {v6, v5}, Lki8;->M(Lhb6;)Lhi8;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_1
    invoke-virtual {v1}, Lcb6;->g()Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-static {v2, v9, v3}, Lf54;->u(Lz47;Ljo2;Ljava/util/List;)Lfj2;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-static {v1, v2}, Lf54;->l(Lcb6;Lz47;)Lt14;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    iget-object v5, v3, Lfj2;->a:Ljava/util/List;

    .line 144
    .line 145
    invoke-virtual {v0, v1, v4, v2, v5}, Lf54;->s(Lcb6;Ljava/util/ArrayList;Lt14;Ljava/util/List;)Le54;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    iget-object v4, v2, Le54;->d:Ljava/util/List;

    .line 150
    .line 151
    invoke-virtual {v0}, Lf54;->p()Li44;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    iget-object v13, v2, Le54;->c:Ljava/util/ArrayList;

    .line 156
    .line 157
    iget-object v14, v2, Le54;->b:Ljava/util/List;

    .line 158
    .line 159
    iget-object v15, v2, Le54;->a:Lt14;

    .line 160
    .line 161
    invoke-virtual {v1}, Lcb6;->b()Ljava/lang/reflect/Member;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Ljava/lang/reflect/Method;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    invoke-virtual {v1}, Lcb6;->b()Ljava/lang/reflect/Member;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Ljava/lang/reflect/Method;

    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    sget-object v5, Lfx4;->X:Lk32;

    .line 190
    .line 191
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    if-eqz v0, :cond_2

    .line 195
    .line 196
    sget-object v0, Lfx4;->g0:Lfx4;

    .line 197
    .line 198
    :goto_2
    move-object/from16 v16, v0

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_2
    if-nez v2, :cond_3

    .line 202
    .line 203
    sget-object v0, Lfx4;->f0:Lfx4;

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_3
    sget-object v0, Lfx4;->Y:Lfx4;

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :goto_3
    invoke-virtual {v1}, Lbb6;->e()Ll5;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v0}, Ls08;->k(Ll5;)Lfl1;

    .line 214
    .line 215
    .line 216
    move-result-object v17

    .line 217
    sget-object v18, Le02;->X:Le02;

    .line 218
    .line 219
    const/4 v10, 0x0

    .line 220
    sget-object v12, Ld02;->X:Ld02;

    .line 221
    .line 222
    invoke-virtual/range {v9 .. v18}, Ldl3;->U0(Li44;Li44;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt14;Lfx4;Lfl1;Ljava/util/Map;)Lq97;

    .line 223
    .line 224
    .line 225
    iget-object v0, v1, Lcb6;->a:Ljava/lang/reflect/Method;

    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isNative(I)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    iput-boolean v0, v9, Ljo2;->s0:Z

    .line 236
    .line 237
    iget-boolean v0, v3, Lfj2;->b:Z

    .line 238
    .line 239
    invoke-virtual {v9, v8, v0}, Ldl3;->W0(ZZ)V

    .line 240
    .line 241
    .line 242
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_4

    .line 247
    .line 248
    return-object v9

    .line 249
    :cond_4
    const-string v0, "Should not be called"

    .line 250
    .line 251
    invoke-static {v0}, Lu52;->k(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    const/4 v0, 0x0

    .line 255
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Lazy scope for "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lf54;->q()Led1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
