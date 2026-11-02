.class public final Lif2;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public g0:Ljp0;

.field public h0:Lea6;

.field public i0:Ljp0;

.field public j0:Z

.field public synthetic k0:Lb71;

.field public synthetic l0:Lze2;

.field public final synthetic m0:J

.field public final synthetic n0:Lsf2;


# direct methods
.method public constructor <init>(JLsf2;Lq51;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lif2;->m0:J

    .line 2
    .line 3
    iput-object p3, p0, Lif2;->n0:Lsf2;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lif2;->k0:Lb71;

    .line 2
    .line 3
    iget-object v1, p0, Lif2;->l0:Lze2;

    .line 4
    .line 5
    iget-boolean v2, p0, Lif2;->j0:Z

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v4, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lif2;->i0:Ljp0;

    .line 15
    .line 16
    iget-object v2, p0, Lif2;->h0:Lea6;

    .line 17
    .line 18
    iget-object v6, p0, Lif2;->g0:Ljp0;

    .line 19
    .line 20
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v5

    .line 30
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Lq0;

    .line 34
    .line 35
    iget-object v2, p0, Lif2;->n0:Lsf2;

    .line 36
    .line 37
    const/16 v6, 0x1b

    .line 38
    .line 39
    invoke-direct {p1, v2, v5, v6}, Lq0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 40
    .line 41
    .line 42
    const/4 v2, -0x1

    .line 43
    sget-object v6, Ll90;->X:Ll90;

    .line 44
    .line 45
    invoke-static {v2, v6, v5, v3}, Lgv3;->b(ILl90;Lgn2;I)Lx90;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    sget-object v7, Lb02;->X:Lb02;

    .line 50
    .line 51
    invoke-static {v0, v7}, Lch3;->M(Lb71;Ls61;)Ls61;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    new-instance v9, Lkv5;

    .line 56
    .line 57
    invoke-direct {v9, v8, v2}, Lkv5;-><init>(Ls61;Lx90;)V

    .line 58
    .line 59
    .line 60
    sget-object v2, Le71;->X:Le71;

    .line 61
    .line 62
    invoke-virtual {v9, v2, v9, p1}, Le1;->n0(Le71;Le1;Lrn2;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, Lea6;

    .line 66
    .line 67
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    new-instance v8, Lgf2;

    .line 71
    .line 72
    iget-wide v10, p0, Lif2;->m0:J

    .line 73
    .line 74
    invoke-direct {v8, v10, v11, v5}, Lgf2;-><init>(JLq51;)V

    .line 75
    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    invoke-static {v10, v6, v5, v3}, Lgv3;->b(ILl90;Lgn2;I)Lx90;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-static {v0, v7}, Lch3;->M(Lb71;Ls61;)Ls61;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-instance v7, Lkv5;

    .line 87
    .line 88
    invoke-direct {v7, v0, v6}, Lkv5;-><init>(Ls61;Lx90;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7, v2, v7, v8}, Le1;->n0(Le71;Le1;Lrn2;)V

    .line 92
    .line 93
    .line 94
    move-object v2, p1

    .line 95
    move-object v0, v7

    .line 96
    move-object v6, v9

    .line 97
    :cond_2
    :goto_0
    iget-object p1, v2, Lea6;->X:Ljava/lang/Object;

    .line 98
    .line 99
    sget-object v7, Ld75;->c:Lz31;

    .line 100
    .line 101
    if-eq p1, v7, :cond_3

    .line 102
    .line 103
    new-instance p1, Ltz6;

    .line 104
    .line 105
    iget-object v7, p0, Ls51;->Y:Ls61;

    .line 106
    .line 107
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-direct {p1, v7}, Ltz6;-><init>(Ls61;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v6}, Ljp0;->o()Lyr6;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    new-instance v8, Lco;

    .line 118
    .line 119
    invoke-direct {v8, v2, v0, v5, v3}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v7, v8}, Ltz6;->g(Lyr6;Lrn2;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v0}, Ljp0;->n()Lyr6;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    new-instance v8, Lq0;

    .line 130
    .line 131
    const/16 v9, 0x1a

    .line 132
    .line 133
    invoke-direct {v8, v2, v1, v5, v9}, Lq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v7, v8}, Ltz6;->g(Lyr6;Lrn2;)V

    .line 137
    .line 138
    .line 139
    iput-object v5, p0, Lif2;->k0:Lb71;

    .line 140
    .line 141
    iput-object v1, p0, Lif2;->l0:Lze2;

    .line 142
    .line 143
    iput-object v6, p0, Lif2;->g0:Ljp0;

    .line 144
    .line 145
    iput-object v2, p0, Lif2;->h0:Lea6;

    .line 146
    .line 147
    iput-object v0, p0, Lif2;->i0:Ljp0;

    .line 148
    .line 149
    iput-boolean v4, p0, Lif2;->j0:Z

    .line 150
    .line 151
    invoke-static {p1, p0}, Ltz6;->d(Ltz6;Luy7;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    sget-object v7, Lc71;->X:Lc71;

    .line 156
    .line 157
    if-ne p1, v7, :cond_2

    .line 158
    .line 159
    return-object v7

    .line 160
    :cond_3
    sget-object p0, Ldn8;->a:Ldn8;

    .line 161
    .line 162
    return-object p0
.end method

.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lze2;

    .line 4
    .line 5
    check-cast p3, Lq51;

    .line 6
    .line 7
    new-instance v0, Lif2;

    .line 8
    .line 9
    iget-wide v1, p0, Lif2;->m0:J

    .line 10
    .line 11
    iget-object p0, p0, Lif2;->n0:Lsf2;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, p0, p3}, Lif2;-><init>(JLsf2;Lq51;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Lif2;->k0:Lb71;

    .line 17
    .line 18
    iput-object p2, v0, Lif2;->l0:Lze2;

    .line 19
    .line 20
    sget-object p0, Ldn8;->a:Ldn8;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Lif2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
