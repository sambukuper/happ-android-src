.class public final Lvv5;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lvz7;

.field public c:Lfn6;

.field public final d:Loh7;

.field public final e:Lh76;

.field public final f:Lu77;

.field public final g:Lf76;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldw4;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ldw4;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lvz7;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lvv5;->b:Lvz7;

    .line 17
    .line 18
    new-instance v0, Lnv5;

    .line 19
    .line 20
    invoke-direct {v0}, Lnv5;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lvv5;->d:Loh7;

    .line 28
    .line 29
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lvv5;->e:Lh76;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    const/4 v1, 0x7

    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-static {v2, v1, v0}, Lv77;->b(IILl90;)Lu77;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lvv5;->f:Lu77;

    .line 43
    .line 44
    invoke-static {v0}, Ljm4;->m(Lu77;)Lf76;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lvv5;->g:Lf76;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final e()V
    .locals 2

    .line 1
    iget-object p0, p0, Lvv5;->d:Loh7;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, Lnv5;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v1, Lnv5;

    .line 17
    .line 18
    invoke-direct {v1}, Lnv5;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    return-void
.end method

.method public final f(Ltv5;)V
    .locals 8

    .line 1
    instance-of v0, p1, Lrv5;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lrv5;

    .line 8
    .line 9
    iget-object v0, p1, Lrv5;->a:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p1, p1, Lrv5;->b:Lfn6;

    .line 12
    .line 13
    iput-object p1, p0, Lvv5;->c:Lfn6;

    .line 14
    .line 15
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v3, Ly9;

    .line 20
    .line 21
    const/16 v4, 0xe

    .line 22
    .line 23
    invoke-direct {v3, p0, v0, v2, v4}, Ly9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v2, v3, v1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    instance-of v0, p1, Lpv5;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Lvv5;->e()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    instance-of v0, p1, Lqv5;

    .line 39
    .line 40
    const/16 v3, 0x9

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v0, Lbv;

    .line 49
    .line 50
    invoke-direct {v0, p0, v2, v3}, Lbv;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v2, v0, v1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    instance-of v0, p1, Lsv5;

    .line 58
    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    check-cast p1, Lsv5;

    .line 62
    .line 63
    iget-object p1, p1, Lsv5;->a:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 64
    .line 65
    iget-object v0, p0, Lvv5;->e:Lh76;

    .line 66
    .line 67
    iget-object v1, v0, Lh76;->X:Loh7;

    .line 68
    .line 69
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Lnv5;

    .line 74
    .line 75
    iget-object v1, v1, Lnv5;->c:Lc83;

    .line 76
    .line 77
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    iget-object v1, v0, Lh76;->X:Loh7;

    .line 84
    .line 85
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Lnv5;

    .line 90
    .line 91
    iget-object v1, v1, Lnv5;->c:Lc83;

    .line 92
    .line 93
    invoke-static {v1, p1}, Loc;->x(Lc83;Ljava/lang/Object;)Lkm5;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    goto :goto_0

    .line 98
    :cond_3
    iget-object v1, v0, Lh76;->X:Loh7;

    .line 99
    .line 100
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Lnv5;

    .line 105
    .line 106
    iget-object v1, v1, Lnv5;->c:Lc83;

    .line 107
    .line 108
    invoke-static {v1, p1}, Loc;->z(Lc83;Ljava/lang/Object;)Lkm5;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    :goto_0
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 113
    .line 114
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Lnv5;

    .line 119
    .line 120
    iget-object v0, v0, Lnv5;->b:Lj2;

    .line 121
    .line 122
    sget-object v1, Lec7;->Y:Lec7;

    .line 123
    .line 124
    invoke-virtual {v1}, Lec7;->c()Lqm5;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const/4 v4, 0x0

    .line 129
    invoke-virtual {v0, v4}, Lz1;->listIterator(I)Ljava/util/ListIterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_4

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    check-cast v4, Lom6;

    .line 144
    .line 145
    iget-object v5, v4, Lom6;->a:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 146
    .line 147
    iget-object v6, p1, Lkm5;->Z:Lll5;

    .line 148
    .line 149
    invoke-virtual {v6, v5}, Lll5;->containsKey(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    iget-object v6, v4, Lom6;->a:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 154
    .line 155
    iget-object v4, v4, Lom6;->b:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    new-instance v7, Lom6;

    .line 161
    .line 162
    invoke-direct {v7, v6, v4, v5}, Lom6;-><init>(Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;Lsu/happ/proxyutility/dto/SubscriptionItem;Z)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v7}, Lqm5;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_4
    invoke-virtual {v1}, Lqm5;->c()Lj2;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    iget-object p0, p0, Lvv5;->d:Loh7;

    .line 174
    .line 175
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    :cond_5
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    move-object v4, v1

    .line 183
    check-cast v4, Lnv5;

    .line 184
    .line 185
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-static {v4, v2, v0, p1, v3}, Lnv5;->a(Lnv5;Ljava/lang/String;Lj2;Lkm5;I)Lnv5;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {p0, v1, v4}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_5

    .line 197
    .line 198
    return-void

    .line 199
    :cond_6
    invoke-static {}, Lb61;->c()V

    .line 200
    .line 201
    .line 202
    return-void
.end method
