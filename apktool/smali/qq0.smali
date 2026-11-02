.class public final Lqq0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvz7;

.field public final b:Lvz7;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw60;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, v1}, Lw60;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lvz7;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lqq0;->a:Lvz7;

    .line 16
    .line 17
    new-instance v0, Lw60;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {v0, v1}, Lw60;-><init>(B)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lvz7;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lqq0;->b:Lvz7;

    .line 29
    .line 30
    return-void
.end method

.method public static synthetic d(Lqq0;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Ls51;I)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->M()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    and-int/lit8 p4, p4, 0x20

    .line 10
    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    const/4 p4, 0x0

    .line 14
    :goto_0
    move v6, p4

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 p4, 0x1

    .line 17
    goto :goto_0

    .line 18
    :goto_1
    sget-object v5, Ltn;->Z:Ltn;

    .line 19
    .line 20
    move-object v0, p0

    .line 21
    move-object v1, p1

    .line 22
    move-object v2, p2

    .line 23
    move-object v7, p3

    .line 24
    invoke-virtual/range {v0 .. v7}, Lqq0;->c(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltn;ZLs51;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method


# virtual methods
.method public final a(Ltn;Ls51;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lnq0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lnq0;

    .line 7
    .line 8
    iget v1, v0, Lnq0;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lnq0;->h0:I

    .line 18
    .line 19
    :goto_0
    move-object p2, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lnq0;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lnq0;-><init>(Lqq0;Ls51;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p2, Lnq0;->f0:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, p2, Lnq0;->h0:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Lqq0;->a:Lvz7;

    .line 51
    .line 52
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Ltq0;

    .line 57
    .line 58
    iput v2, p2, Lnq0;->h0:I

    .line 59
    .line 60
    move-object v4, p4

    .line 61
    move-object p4, p3

    .line 62
    move-object p3, v4

    .line 63
    invoke-virtual/range {p0 .. p5}, Ltq0;->b(Ltn;Ls51;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget-object p0, Lc71;->X:Lc71;

    .line 68
    .line 69
    if-ne v0, p0, :cond_3

    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_3
    :goto_2
    check-cast v0, Lx83;

    .line 73
    .line 74
    sget-object p0, Lv83;->a:Lv83;

    .line 75
    .line 76
    invoke-static {v0, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_4

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_4
    return-object v0
.end method

.method public final b(Ltn;Lyn1;Lyn1;Ls51;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p4, Loq0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Loq0;

    .line 7
    .line 8
    iget v1, v0, Loq0;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Loq0;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Loq0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Loq0;-><init>(Lqq0;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Loq0;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Loq0;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    sget-object v5, Lc71;->X:Lc71;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v4

    .line 50
    :cond_2
    iget-object p3, v0, Loq0;->f0:Lyn1;

    .line 51
    .line 52
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p4, p0, Lqq0;->a:Lvz7;

    .line 60
    .line 61
    invoke-virtual {p4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p4

    .line 65
    check-cast p4, Ltq0;

    .line 66
    .line 67
    iput-object p3, v0, Loq0;->f0:Lyn1;

    .line 68
    .line 69
    iput v3, v0, Loq0;->i0:I

    .line 70
    .line 71
    invoke-virtual {p4, p1, p2, v0}, Ltq0;->a(Ltn;Lrn2;Ls51;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v5, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    :goto_1
    iget-object p0, p0, Lqq0;->b:Lvz7;

    .line 79
    .line 80
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    check-cast p0, Lar0;

    .line 85
    .line 86
    iput-object v4, v0, Loq0;->f0:Lyn1;

    .line 87
    .line 88
    iput v2, v0, Loq0;->i0:I

    .line 89
    .line 90
    invoke-virtual {p0, p3, v0}, Lar0;->b(Lrn2;Ls51;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-ne p0, v5, :cond_5

    .line 95
    .line 96
    :goto_2
    return-object v5

    .line 97
    :cond_5
    :goto_3
    sget-object p0, Ldn8;->a:Ldn8;

    .line 98
    .line 99
    return-object p0
.end method

.method public final c(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltn;ZLs51;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v4, p2

    .line 6
    .line 7
    move-object/from16 v2, p3

    .line 8
    .line 9
    move-object/from16 v0, p7

    .line 10
    .line 11
    instance-of v3, v0, Lpq0;

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    move-object v3, v0

    .line 16
    check-cast v3, Lpq0;

    .line 17
    .line 18
    iget v5, v3, Lpq0;->l0:I

    .line 19
    .line 20
    const/high16 v7, -0x80000000

    .line 21
    .line 22
    and-int v8, v5, v7

    .line 23
    .line 24
    if-eqz v8, :cond_0

    .line 25
    .line 26
    sub-int/2addr v5, v7

    .line 27
    iput v5, v3, Lpq0;->l0:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v3, Lpq0;

    .line 31
    .line 32
    invoke-direct {v3, v1, v0}, Lpq0;-><init>(Lqq0;Ls51;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v0, v3, Lpq0;->j0:Ljava/lang/Object;

    .line 36
    .line 37
    iget v5, v3, Lpq0;->l0:I

    .line 38
    .line 39
    sget-object v7, Lv83;->a:Lv83;

    .line 40
    .line 41
    const/4 v8, 0x2

    .line 42
    const/4 v9, 0x1

    .line 43
    const/4 v10, 0x0

    .line 44
    sget-object v11, Lc71;->X:Lc71;

    .line 45
    .line 46
    if-eqz v5, :cond_3

    .line 47
    .line 48
    if-eq v5, v9, :cond_2

    .line 49
    .line 50
    if-ne v5, v8, :cond_1

    .line 51
    .line 52
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_f

    .line 56
    .line 57
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v10

    .line 63
    :cond_2
    iget-boolean v2, v3, Lpq0;->i0:Z

    .line 64
    .line 65
    iget-object v4, v3, Lpq0;->h0:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v5, v3, Lpq0;->g0:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v6, v3, Lpq0;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 70
    .line 71
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move v10, v2

    .line 75
    move-object v8, v4

    .line 76
    goto/16 :goto_b

    .line 77
    .line 78
    :cond_3
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/MetaParams;->P()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-nez v0, :cond_5

    .line 92
    .line 93
    :cond_4
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;->m()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sget-object v5, Lss8;->a:Lss8;

    .line 98
    .line 99
    invoke-static {v0}, Lss8;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :cond_5
    sget-object v5, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 104
    .line 105
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    iget-object v5, v5, Lsu/happ/proxyutility/HappApplication;->X:Lvz7;

    .line 110
    .line 111
    invoke-virtual {v5}, Lvz7;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    check-cast v5, Lan7;

    .line 116
    .line 117
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object v12, v5, Lan7;->c:Lvz7;

    .line 124
    .line 125
    invoke-virtual {v12}, Lvz7;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    check-cast v12, Lcom/tencent/mmkv/MMKV;

    .line 130
    .line 131
    new-instance v13, Ljava/util/HashSet;

    .line 132
    .line 133
    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 134
    .line 135
    .line 136
    const-string v14, "pref_blacklist"

    .line 137
    .line 138
    invoke-virtual {v12, v14, v13}, Lcom/tencent/mmkv/MMKV;->k(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    if-nez v12, :cond_6

    .line 143
    .line 144
    new-instance v12, Ljava/util/HashSet;

    .line 145
    .line 146
    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    .line 147
    .line 148
    .line 149
    :cond_6
    iget-object v13, v5, Lan7;->e:Ljava/util/Set;

    .line 150
    .line 151
    invoke-static {v13, v12}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    if-nez v13, :cond_9

    .line 156
    .line 157
    iput-object v12, v5, Lan7;->e:Ljava/util/Set;

    .line 158
    .line 159
    check-cast v12, Ljava/lang/Iterable;

    .line 160
    .line 161
    new-instance v13, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 164
    .line 165
    .line 166
    new-instance v14, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v15

    .line 179
    if-eqz v15, :cond_8

    .line 180
    .line 181
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v15

    .line 185
    move-object v10, v15

    .line 186
    check-cast v10, Ljava/lang/String;

    .line 187
    .line 188
    sget-object v16, Los1;->d:Ljava/util/regex/Pattern;

    .line 189
    .line 190
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    sget-object v8, Los1;->d:Ljava/util/regex/Pattern;

    .line 194
    .line 195
    invoke-virtual {v8, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    if-nez v8, :cond_7

    .line 204
    .line 205
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_7
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    :goto_2
    const/4 v8, 0x2

    .line 213
    const/4 v10, 0x0

    .line 214
    goto :goto_1

    .line 215
    :cond_8
    new-instance v8, Los1;

    .line 216
    .line 217
    invoke-static {v13}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    invoke-static {v14}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    invoke-direct {v8, v10, v12}, Los1;-><init>(Ljava/util/Set;Ljava/util/Set;)V

    .line 226
    .line 227
    .line 228
    iput-object v8, v5, Lan7;->f:Los1;

    .line 229
    .line 230
    :cond_9
    iget-object v5, v5, Lan7;->f:Los1;

    .line 231
    .line 232
    const/4 v8, 0x0

    .line 233
    if-eqz v5, :cond_14

    .line 234
    .line 235
    invoke-static {v0}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 244
    .line 245
    invoke-virtual {v0, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    :try_start_0
    sget-object v0, Lss8;->a:Lss8;

    .line 253
    .line 254
    invoke-static {v10}, Lss8;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 258
    goto :goto_3

    .line 259
    :catchall_0
    move-exception v0

    .line 260
    instance-of v12, v0, Ljava/lang/InterruptedException;

    .line 261
    .line 262
    if-nez v12, :cond_13

    .line 263
    .line 264
    instance-of v12, v0, Ljava/util/concurrent/CancellationException;

    .line 265
    .line 266
    if-nez v12, :cond_13

    .line 267
    .line 268
    new-instance v12, Lrj6;

    .line 269
    .line 270
    invoke-direct {v12, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 271
    .line 272
    .line 273
    move-object v0, v12

    .line 274
    :goto_3
    nop

    .line 275
    instance-of v12, v0, Lrj6;

    .line 276
    .line 277
    if-eqz v12, :cond_a

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_a
    move-object v10, v0

    .line 281
    :goto_4
    check-cast v10, Ljava/lang/String;

    .line 282
    .line 283
    :try_start_1
    new-instance v0, Ljava/net/URI;

    .line 284
    .line 285
    invoke-direct {v0, v10}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 292
    goto :goto_5

    .line 293
    :catchall_1
    move-exception v0

    .line 294
    instance-of v12, v0, Ljava/lang/InterruptedException;

    .line 295
    .line 296
    if-nez v12, :cond_12

    .line 297
    .line 298
    instance-of v12, v0, Ljava/util/concurrent/CancellationException;

    .line 299
    .line 300
    if-nez v12, :cond_12

    .line 301
    .line 302
    new-instance v12, Lrj6;

    .line 303
    .line 304
    invoke-direct {v12, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 305
    .line 306
    .line 307
    move-object v0, v12

    .line 308
    :goto_5
    nop

    .line 309
    instance-of v12, v0, Lrj6;

    .line 310
    .line 311
    if-eqz v12, :cond_b

    .line 312
    .line 313
    const/4 v0, 0x0

    .line 314
    :cond_b
    check-cast v0, Ljava/lang/String;

    .line 315
    .line 316
    if-nez v0, :cond_c

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_c
    move-object v10, v0

    .line 320
    :goto_6
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-nez v0, :cond_d

    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_d
    sget-object v0, Los1;->d:Ljava/util/regex/Pattern;

    .line 328
    .line 329
    invoke-virtual {v0, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-eqz v0, :cond_e

    .line 338
    .line 339
    iget-object v0, v5, Los1;->c:Ljava/util/HashSet;

    .line 340
    .line 341
    invoke-virtual {v0, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    move v8, v0

    .line 346
    goto :goto_7

    .line 347
    :cond_e
    new-array v0, v9, [C

    .line 348
    .line 349
    const/16 v12, 0x2e

    .line 350
    .line 351
    aput-char v12, v0, v8

    .line 352
    .line 353
    invoke-static {v10, v0}, Lfm7;->E0(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-static {v0}, Lwv0;->M0(Ljava/util/List;)Ljava/util/List;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    iget-object v5, v5, Los1;->b:Lns1;

    .line 362
    .line 363
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v10

    .line 371
    if-eqz v10, :cond_11

    .line 372
    .line 373
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v10

    .line 377
    check-cast v10, Ljava/lang/String;

    .line 378
    .line 379
    iget-object v5, v5, Lns1;->a:Ljava/util/Map;

    .line 380
    .line 381
    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    check-cast v5, Lns1;

    .line 386
    .line 387
    if-nez v5, :cond_10

    .line 388
    .line 389
    goto :goto_7

    .line 390
    :cond_10
    iget-boolean v10, v5, Lns1;->b:Z

    .line 391
    .line 392
    if-eqz v10, :cond_f

    .line 393
    .line 394
    move v8, v9

    .line 395
    goto :goto_7

    .line 396
    :cond_11
    iget-boolean v8, v5, Lns1;->b:Z

    .line 397
    .line 398
    goto :goto_7

    .line 399
    :cond_12
    throw v0

    .line 400
    :cond_13
    throw v0

    .line 401
    :cond_14
    :goto_7
    if-eqz v8, :cond_17

    .line 402
    .line 403
    if-nez v4, :cond_15

    .line 404
    .line 405
    sget-object v0, Lsu/happ/proxyutility/domain/sub/SubId;->Companion:Lcn7;

    .line 406
    .line 407
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    invoke-static {}, Lrl8;->a()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    goto :goto_8

    .line 415
    :cond_15
    move-object v0, v4

    .line 416
    :goto_8
    if-eqz v4, :cond_16

    .line 417
    .line 418
    sget-object v1, Lkw4;->a:Lkw4;

    .line 419
    .line 420
    invoke-static {v4}, Lkw4;->r(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    :cond_16
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 424
    .line 425
    invoke-virtual {v6, v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->o0(Ljava/lang/Boolean;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;->p0()V

    .line 429
    .line 430
    .line 431
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 432
    .line 433
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-virtual {v1}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    new-instance v2, Lh80;

    .line 442
    .line 443
    const/4 v3, 0x2

    .line 444
    invoke-direct {v2, v3}, Lh80;-><init>(B)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v1, v2}, Lkf4;->h(Lgn2;)V

    .line 448
    .line 449
    .line 450
    sget-object v1, Lkw4;->a:Lkw4;

    .line 451
    .line 452
    invoke-static {v6, v0}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    return-object v7

    .line 456
    :cond_17
    if-eqz v2, :cond_1d

    .line 457
    .line 458
    new-instance v0, Lsu/happ/proxyutility/dto/InstallId;

    .line 459
    .line 460
    invoke-direct {v0, v2}, Lsu/happ/proxyutility/dto/InstallId;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/InstallId;->c()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;->M()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v5

    .line 471
    if-nez v5, :cond_18

    .line 472
    .line 473
    const/4 v5, 0x0

    .line 474
    :cond_18
    invoke-static {v5, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    if-eqz v2, :cond_1a

    .line 479
    .line 480
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;->J()Ljava/lang/Boolean;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    if-nez v2, :cond_19

    .line 485
    .line 486
    goto :goto_9

    .line 487
    :cond_19
    const/4 v0, 0x0

    .line 488
    :cond_1a
    :goto_9
    if-eqz v0, :cond_1b

    .line 489
    .line 490
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/InstallId;->c()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    move-object v5, v0

    .line 495
    goto :goto_a

    .line 496
    :cond_1b
    const/4 v5, 0x0

    .line 497
    :goto_a
    if-eqz v5, :cond_1d

    .line 498
    .line 499
    iput-object v6, v3, Lpq0;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 500
    .line 501
    iput-object v4, v3, Lpq0;->g0:Ljava/lang/String;

    .line 502
    .line 503
    move-object/from16 v8, p4

    .line 504
    .line 505
    iput-object v8, v3, Lpq0;->h0:Ljava/lang/String;

    .line 506
    .line 507
    move/from16 v10, p6

    .line 508
    .line 509
    iput-boolean v10, v3, Lpq0;->i0:Z

    .line 510
    .line 511
    iput v9, v3, Lpq0;->l0:I

    .line 512
    .line 513
    move-object/from16 v2, p5

    .line 514
    .line 515
    invoke-virtual/range {v1 .. v6}, Lqq0;->a(Ltn;Ls51;Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    if-ne v0, v11, :cond_1c

    .line 520
    .line 521
    goto/16 :goto_e

    .line 522
    .line 523
    :cond_1c
    move-object/from16 v6, p1

    .line 524
    .line 525
    move-object/from16 v5, p2

    .line 526
    .line 527
    :goto_b
    check-cast v0, Lx83;

    .line 528
    .line 529
    instance-of v0, v0, Lv83;

    .line 530
    .line 531
    if-eqz v0, :cond_1e

    .line 532
    .line 533
    return-object v7

    .line 534
    :cond_1d
    move-object/from16 v8, p4

    .line 535
    .line 536
    move/from16 v10, p6

    .line 537
    .line 538
    move-object/from16 v6, p1

    .line 539
    .line 540
    move-object/from16 v5, p2

    .line 541
    .line 542
    :cond_1e
    if-eqz v8, :cond_24

    .line 543
    .line 544
    new-instance v0, Lsu/happ/proxyutility/dto/ProviderId;

    .line 545
    .line 546
    invoke-direct {v0, v8}, Lsu/happ/proxyutility/dto/ProviderId;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ProviderId;->d()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    if-nez v10, :cond_21

    .line 554
    .line 555
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v4

    .line 559
    if-nez v4, :cond_1f

    .line 560
    .line 561
    const/4 v4, 0x0

    .line 562
    :cond_1f
    invoke-static {v4, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    if-eqz v2, :cond_21

    .line 567
    .line 568
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;->d0()Z

    .line 569
    .line 570
    .line 571
    move-result v2

    .line 572
    if-eqz v2, :cond_20

    .line 573
    .line 574
    goto :goto_c

    .line 575
    :cond_20
    const/4 v0, 0x0

    .line 576
    :cond_21
    :goto_c
    if-eqz v0, :cond_22

    .line 577
    .line 578
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ProviderId;->d()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    goto :goto_d

    .line 583
    :cond_22
    const/4 v0, 0x0

    .line 584
    :goto_d
    if-eqz v0, :cond_24

    .line 585
    .line 586
    iget-object v1, v1, Lqq0;->b:Lvz7;

    .line 587
    .line 588
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    check-cast v1, Lar0;

    .line 593
    .line 594
    const/4 v2, 0x0

    .line 595
    iput-object v2, v3, Lpq0;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 596
    .line 597
    iput-object v2, v3, Lpq0;->g0:Ljava/lang/String;

    .line 598
    .line 599
    iput-object v2, v3, Lpq0;->h0:Ljava/lang/String;

    .line 600
    .line 601
    iput-boolean v10, v3, Lpq0;->i0:Z

    .line 602
    .line 603
    const/4 v2, 0x2

    .line 604
    iput v2, v3, Lpq0;->l0:I

    .line 605
    .line 606
    const/4 v2, 0x0

    .line 607
    move-object/from16 p1, v0

    .line 608
    .line 609
    move-object/from16 p0, v1

    .line 610
    .line 611
    move/from16 p4, v2

    .line 612
    .line 613
    move-object/from16 p5, v3

    .line 614
    .line 615
    move-object/from16 p2, v5

    .line 616
    .line 617
    move-object/from16 p3, v6

    .line 618
    .line 619
    invoke-virtual/range {p0 .. p5}, Lar0;->c(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZLs51;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    if-ne v0, v11, :cond_23

    .line 624
    .line 625
    :goto_e
    return-object v11

    .line 626
    :cond_23
    :goto_f
    check-cast v0, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 627
    .line 628
    :cond_24
    sget-object v0, Lw83;->a:Lw83;

    .line 629
    .line 630
    return-object v0
.end method
