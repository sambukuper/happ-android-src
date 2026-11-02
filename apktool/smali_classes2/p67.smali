.class public final Lp67;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lvz7;

.field public final c:Loh7;

.field public final d:Lh76;

.field public final e:Lu77;

.field public final f:Lf76;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr47;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-direct {v0, v1}, Lr47;-><init>(B)V

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
    iput-object v1, p0, Lp67;->b:Lvz7;

    .line 16
    .line 17
    new-instance v0, Le67;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, v1, v1}, Le67;-><init>(ZZ)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lp67;->c:Loh7;

    .line 28
    .line 29
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lp67;->d:Lh76;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    const/4 v2, 0x7

    .line 37
    invoke-static {v1, v2, v0}, Lv77;->b(IILl90;)Lu77;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lp67;->e:Lu77;

    .line 42
    .line 43
    invoke-static {v0}, Ljm4;->m(Lu77;)Lf76;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lp67;->f:Lf76;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final e(Ls51;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, Lo67;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lo67;

    .line 7
    .line 8
    iget v1, v0, Lo67;->h0:I

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
    iput v1, v0, Lo67;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo67;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lo67;-><init>(Lp67;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lo67;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lo67;->h0:I

    .line 28
    .line 29
    sget-object v2, Lc71;->X:Lc71;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iget-object v4, p0, Lp67;->c:Loh7;

    .line 33
    .line 34
    const/4 v5, 0x3

    .line 35
    const/4 v6, 0x2

    .line 36
    sget-object v7, Ldn8;->a:Ldn8;

    .line 37
    .line 38
    const/4 v8, 0x1

    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    if-eq v1, v8, :cond_3

    .line 42
    .line 43
    if-eq v1, v6, :cond_2

    .line 44
    .line 45
    if-ne v1, v5, :cond_1

    .line 46
    .line 47
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object v7

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return-object p0

    .line 58
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-object v7

    .line 62
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lp67;->d:Lh76;

    .line 70
    .line 71
    iget-object p1, p1, Lh76;->X:Loh7;

    .line 72
    .line 73
    invoke-virtual {p1}, Loh7;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Le67;

    .line 78
    .line 79
    iget-boolean p1, p1, Le67;->b:Z

    .line 80
    .line 81
    if-eqz p1, :cond_5

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_5
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    :cond_6
    invoke-virtual {v4}, Loh7;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    move-object v1, p1

    .line 92
    check-cast v1, Le67;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v3, v8, v8}, Le67;->a(Le67;ZZI)Le67;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v4, p1, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_6

    .line 106
    .line 107
    iget-object p1, p0, Lp67;->b:Lvz7;

    .line 108
    .line 109
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, Lmq0;

    .line 114
    .line 115
    iput v8, v0, Lo67;->h0:I

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Lmq0;->a(Ls51;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-ne p1, v2, :cond_7

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    :goto_1
    check-cast p1, Lja3;

    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    :cond_8
    invoke-virtual {v4}, Loh7;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    move-object v9, v1

    .line 134
    check-cast v9, Le67;

    .line 135
    .line 136
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-static {v9, v3, v3, v8}, Le67;->a(Le67;ZZI)Le67;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    invoke-virtual {v4, v1, v9}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-eqz v1, :cond_8

    .line 148
    .line 149
    iget-object p0, p0, Lp67;->e:Lu77;

    .line 150
    .line 151
    if-nez p1, :cond_a

    .line 152
    .line 153
    iput v6, v0, Lo67;->h0:I

    .line 154
    .line 155
    sget-object p1, Lg67;->a:Lg67;

    .line 156
    .line 157
    invoke-virtual {p0, p1, v0}, Lu77;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-ne p0, v2, :cond_9

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_9
    move-object p0, v7

    .line 165
    :goto_2
    if-ne p0, v2, :cond_c

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_a
    new-instance v1, Lf67;

    .line 169
    .line 170
    invoke-direct {v1, p1}, Lf67;-><init>(Lja3;)V

    .line 171
    .line 172
    .line 173
    iput v5, v0, Lo67;->h0:I

    .line 174
    .line 175
    invoke-virtual {p0, v1, v0}, Lu77;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    if-ne p0, v2, :cond_b

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_b
    move-object p0, v7

    .line 183
    :goto_3
    if-ne p0, v2, :cond_c

    .line 184
    .line 185
    :goto_4
    return-object v2

    .line 186
    :cond_c
    :goto_5
    return-object v7
.end method

.method public final f(Ll67;)V
    .locals 4

    .line 1
    instance-of v0, p1, Li67;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Lr5;

    .line 10
    .line 11
    const/16 v1, 0x1d

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, p0, v2, v1}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x3

    .line 18
    invoke-static {p1, v2, v0, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    instance-of v0, p1, Lk67;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    const/4 v2, 0x0

    .line 26
    iget-object p0, p0, Lp67;->c:Loh7;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    move-object v0, p1

    .line 38
    check-cast v0, Le67;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-static {v0, v3, v2, v1}, Le67;->a(Le67;ZZI)Le67;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p0, p1, v0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    instance-of p1, p1, Lj67;

    .line 56
    .line 57
    if-eqz p1, :cond_4

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    move-object v0, p1

    .line 67
    check-cast v0, Le67;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v2, v2, v1}, Le67;->a(Le67;ZZI)Le67;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p0, p1, v0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    :goto_0
    return-void

    .line 83
    :cond_4
    invoke-static {}, Lb61;->c()V

    .line 84
    .line 85
    .line 86
    return-void
.end method
