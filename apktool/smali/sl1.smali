.class public final Lsl1;
.super Lgm1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g:Lz14;

.field public final h:Lte4;

.field public final i:Lte4;

.field public final synthetic j:Lvl1;


# direct methods
.method public constructor <init>(Lvl1;Lz14;)V
    .locals 8

    .line 1
    iput-object p1, p0, Lsl1;->j:Lvl1;

    .line 2
    .line 3
    iget-object v1, p1, Lvl1;->n0:Ljl1;

    .line 4
    .line 5
    iget-object v0, p1, Lvl1;->g0:Lfy5;

    .line 6
    .line 7
    iget-object v2, v0, Lfy5;->s0:Ljava/util/List;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-object v3, v2

    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    move-object v5, v4

    .line 33
    check-cast v5, Lvy5;

    .line 34
    .line 35
    sget-object v6, Lmd2;->A:Ljd2;

    .line 36
    .line 37
    iget v5, v5, Lvy5;->f0:I

    .line 38
    .line 39
    invoke-virtual {v6, v5}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-nez v5, :cond_0

    .line 48
    .line 49
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object v3, v0, Lfy5;->t0:Ljava/util/List;

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-object v4, v3

    .line 59
    new-instance v3, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    move-object v6, v5

    .line 79
    check-cast v6, Lcz5;

    .line 80
    .line 81
    sget-object v7, Lmd2;->L:Ljd2;

    .line 82
    .line 83
    iget v6, v6, Lcz5;->f0:I

    .line 84
    .line 85
    invoke-virtual {v7, v6}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-nez v6, :cond_2

    .line 94
    .line 95
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    iget-object v4, v0, Lfy5;->u0:Ljava/util/List;

    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v0, v0, Lfy5;->m0:Ljava/util/List;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object p1, p1, Lvl1;->n0:Ljl1;

    .line 110
    .line 111
    iget-object p1, p1, Ljl1;->Y:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p1, Lw15;

    .line 114
    .line 115
    new-instance v5, Ljava/util/ArrayList;

    .line 116
    .line 117
    const/16 v6, 0xa

    .line 118
    .line 119
    invoke-static {v0, v6}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

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
    move-result v6

    .line 134
    if-eqz v6, :cond_4

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    check-cast v6, Ljava/lang/Number;

    .line 141
    .line 142
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    invoke-static {p1, v6}, Lu70;->S(Lw15;I)Lv15;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_4
    new-instance p1, Lpl1;

    .line 155
    .line 156
    const/4 v6, 0x0

    .line 157
    invoke-direct {p1, v5, v6}, Lpl1;-><init>(Ljava/util/ArrayList;B)V

    .line 158
    .line 159
    .line 160
    move-object v0, p0

    .line 161
    move-object v5, p1

    .line 162
    invoke-direct/range {v0 .. v5}, Lgm1;-><init>(Ljl1;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ldn2;)V

    .line 163
    .line 164
    .line 165
    iget-object p0, v1, Ljl1;->X:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p0, Lhl1;

    .line 168
    .line 169
    iput-object p2, v0, Lsl1;->g:Lz14;

    .line 170
    .line 171
    iget-object p1, p0, Lhl1;->a:Lve4;

    .line 172
    .line 173
    new-instance p2, Lql1;

    .line 174
    .line 175
    invoke-direct {p2, v0, v6}, Lql1;-><init>(Lsl1;B)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    new-instance v1, Lte4;

    .line 182
    .line 183
    invoke-direct {v1, p1, p2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 184
    .line 185
    .line 186
    iput-object v1, v0, Lsl1;->h:Lte4;

    .line 187
    .line 188
    iget-object p0, p0, Lhl1;->a:Lve4;

    .line 189
    .line 190
    new-instance p1, Lql1;

    .line 191
    .line 192
    const/4 p2, 0x1

    .line 193
    invoke-direct {p1, v0, p2}, Lql1;-><init>(Lsl1;B)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    new-instance p2, Lte4;

    .line 200
    .line 201
    invoke-direct {p2, p0, p1}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 202
    .line 203
    .line 204
    iput-object p2, v0, Lsl1;->i:Lte4;

    .line 205
    .line 206
    return-void
.end method


# virtual methods
.method public final a(Lpk1;Lgn2;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsl1;->h:Lte4;

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

.method public final b(Lv15;Lx45;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lsl1;->s(Lv15;Lx45;)V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Lgm1;->b(Lv15;Lx45;)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final e(Lv15;Lx45;)Lot0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lsl1;->s(Lv15;Lx45;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lsl1;->j:Lvl1;

    .line 11
    .line 12
    iget-object v0, v0, Lvl1;->r0:Lz47;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, v0, Lz47;->Z:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lvt1;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lvt1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lsx4;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    invoke-super {p0, p1, p2}, Lgm1;->e(Lv15;Lx45;)Lot0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final f(Lv15;Lx45;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lsl1;->s(Lv15;Lx45;)V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Lgm1;->f(Lv15;Lx45;)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final h(Ljava/util/ArrayList;Lgn2;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lsl1;->j:Lvl1;

    .line 2
    .line 3
    iget-object p0, p0, Lvl1;->r0:Lz47;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    iget-object p2, p0, Lz47;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Ljava/lang/Iterable;

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lv15;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lz47;->Z:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Lvt1;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Lvt1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lsx4;

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/4 v0, 0x0

    .line 58
    :cond_2
    if-nez v0, :cond_3

    .line 59
    .line 60
    sget-object v0, Ld02;->X:Ld02;

    .line 61
    .line 62
    :cond_3
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final j(Lv15;Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsl1;->i:Lte4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lte4;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Collection;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lt14;

    .line 29
    .line 30
    invoke-virtual {v1}, Lt14;->K()Let4;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v3, Lx45;->Z:Lx45;

    .line 35
    .line 36
    invoke-interface {v1, p1, v3}, Let4;->b(Lv15;Lx45;)Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Lgm1;->b:Ljl1;

    .line 45
    .line 46
    iget-object v1, v0, Ljl1;->X:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lhl1;

    .line 49
    .line 50
    iget-object v1, v1, Lhl1;->n:Li7;

    .line 51
    .line 52
    iget-object v3, p0, Lsl1;->j:Lvl1;

    .line 53
    .line 54
    invoke-interface {v1, p1, v3}, Li7;->l(Lv15;Lsx4;)Ljava/util/Collection;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 59
    .line 60
    .line 61
    new-instance v3, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v3, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, v0, Ljl1;->X:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lhl1;

    .line 69
    .line 70
    iget-object v0, v0, Lhl1;->q:Lp45;

    .line 71
    .line 72
    check-cast v0, Lq45;

    .line 73
    .line 74
    iget-object v0, v0, Lq45;->d:Lhf5;

    .line 75
    .line 76
    new-instance v5, Lrl1;

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    invoke-direct {v5, p2, v1}, Lrl1;-><init>(Ljava/util/AbstractCollection;B)V

    .line 80
    .line 81
    .line 82
    iget-object v4, p0, Lsl1;->j:Lvl1;

    .line 83
    .line 84
    move-object v1, p1

    .line 85
    invoke-virtual/range {v0 .. v5}, Lhf5;->h(Lv15;Ljava/util/Collection;Ljava/util/Collection;Lsx4;Lz51;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final k(Lv15;Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsl1;->i:Lte4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lte4;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Collection;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lt14;

    .line 29
    .line 30
    invoke-virtual {v1}, Lt14;->K()Let4;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v3, Lx45;->Z:Lx45;

    .line 35
    .line 36
    invoke-interface {v1, p1, v3}, Let4;->f(Lv15;Lx45;)Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v3, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lgm1;->b:Ljl1;

    .line 50
    .line 51
    iget-object v0, v0, Ljl1;->X:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lhl1;

    .line 54
    .line 55
    iget-object v0, v0, Lhl1;->q:Lp45;

    .line 56
    .line 57
    check-cast v0, Lq45;

    .line 58
    .line 59
    iget-object v0, v0, Lq45;->d:Lhf5;

    .line 60
    .line 61
    new-instance v5, Lrl1;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-direct {v5, p2, v1}, Lrl1;-><init>(Ljava/util/AbstractCollection;B)V

    .line 65
    .line 66
    .line 67
    iget-object v4, p0, Lsl1;->j:Lvl1;

    .line 68
    .line 69
    move-object v1, p1

    .line 70
    invoke-virtual/range {v0 .. v5}, Lhf5;->h(Lv15;Ljava/util/Collection;Ljava/util/Collection;Lsx4;Lz51;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final l(Lv15;)Lqs0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsl1;->j:Lvl1;

    .line 5
    .line 6
    iget-object p0, p0, Lvl1;->j0:Lqs0;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lqs0;->d(Lv15;)Lqs0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final n()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object p0, p0, Lsl1;->j:Lvl1;

    .line 2
    .line 3
    iget-object p0, p0, Lvl1;->p0:Lul1;

    .line 4
    .line 5
    invoke-virtual {p0}, Li3;->e()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lt14;

    .line 29
    .line 30
    invoke-virtual {v1}, Lt14;->K()Let4;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Let4;->d()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Iterable;

    .line 39
    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return-object p0

    .line 44
    :cond_0
    invoke-static {v0, v1}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-object v0
.end method

.method public final o()Ljava/util/Set;
    .locals 4

    .line 1
    iget-object v0, p0, Lsl1;->j:Lvl1;

    .line 2
    .line 3
    iget-object v1, v0, Lvl1;->p0:Lul1;

    .line 4
    .line 5
    invoke-virtual {v1}, Li3;->e()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lt14;

    .line 29
    .line 30
    invoke-virtual {v3}, Lt14;->K()Let4;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {v3}, Let4;->c()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/Iterable;

    .line 39
    .line 40
    invoke-static {v2, v3}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object p0, p0, Lgm1;->b:Ljl1;

    .line 45
    .line 46
    iget-object p0, p0, Ljl1;->X:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lhl1;

    .line 49
    .line 50
    iget-object p0, p0, Lhl1;->n:Li7;

    .line 51
    .line 52
    invoke-interface {p0, v0}, Li7;->f(Lsx4;)Ljava/util/Collection;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v2, p0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 57
    .line 58
    .line 59
    return-object v2
.end method

.method public final p()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object p0, p0, Lsl1;->j:Lvl1;

    .line 2
    .line 3
    iget-object p0, p0, Lvl1;->p0:Lul1;

    .line 4
    .line 5
    invoke-virtual {p0}, Li3;->e()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lt14;

    .line 29
    .line 30
    invoke-virtual {v1}, Lt14;->K()Let4;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Let4;->g()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Iterable;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-object v0
.end method

.method public final r(Ljm1;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lgm1;->b:Ljl1;

    .line 2
    .line 3
    iget-object v0, v0, Ljl1;->X:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lhl1;

    .line 6
    .line 7
    iget-object v0, v0, Lhl1;->o:Lpo5;

    .line 8
    .line 9
    iget-object p0, p0, Lsl1;->j:Lvl1;

    .line 10
    .line 11
    invoke-interface {v0, p0, p1}, Lpo5;->K(Lsx4;Ljm1;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final s(Lv15;Lx45;)V
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
    iget-object p1, p0, Lgm1;->b:Ljl1;

    .line 8
    .line 9
    iget-object p1, p1, Ljl1;->X:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lhl1;

    .line 12
    .line 13
    iget-object p1, p1, Lhl1;->i:Lqe4;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lsl1;->j:Lvl1;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-void
.end method
