.class public final Lhb1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Lca6;

.field public h0:B

.field public synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Lca6;

.field public final synthetic k0:Lib1;

.field public final synthetic l0:Ljava/lang/Object;

.field public final synthetic m0:Z


# direct methods
.method public constructor <init>(Lca6;Lib1;Ljava/lang/Object;ZLq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhb1;->j0:Lca6;

    .line 2
    .line 3
    iput-object p2, p0, Lhb1;->k0:Lib1;

    .line 4
    .line 5
    iput-object p3, p0, Lhb1;->l0:Ljava/lang/Object;

    .line 6
    .line 7
    iput-boolean p4, p0, Lhb1;->m0:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lca2;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lhb1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lhb1;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lhb1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 6

    .line 1
    new-instance v0, Lhb1;

    .line 2
    .line 3
    iget-object v3, p0, Lhb1;->l0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-boolean v4, p0, Lhb1;->m0:Z

    .line 6
    .line 7
    iget-object v1, p0, Lhb1;->j0:Lca6;

    .line 8
    .line 9
    iget-object v2, p0, Lhb1;->k0:Lib1;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lhb1;-><init>(Lca6;Lib1;Ljava/lang/Object;ZLq51;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, v0, Lhb1;->i0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Lhb1;->h0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lhb1;->l0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lhb1;->k0:Lib1;

    .line 8
    .line 9
    iget-object v4, p0, Lhb1;->j0:Lca6;

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    sget-object v8, Lc71;->X:Lc71;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    if-eq v0, v6, :cond_1

    .line 19
    .line 20
    if-ne v0, v5, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_3

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v7

    .line 32
    :cond_1
    iget-object v0, p0, Lhb1;->g0:Lca6;

    .line 33
    .line 34
    iget-object v6, p0, Lhb1;->i0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v6, Lca2;

    .line 37
    .line 38
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lhb1;->i0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lca2;

    .line 48
    .line 49
    invoke-virtual {v3}, Lib1;->b()Lja7;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object p1, p0, Lhb1;->i0:Ljava/lang/Object;

    .line 54
    .line 55
    iput-object v4, p0, Lhb1;->g0:Lca6;

    .line 56
    .line 57
    iput-byte v6, p0, Lhb1;->h0:B

    .line 58
    .line 59
    iget-object v0, v0, Lja7;->b:Lyr2;

    .line 60
    .line 61
    iget-object v0, v0, Lyr2;->Y:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    new-instance v6, Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-direct {v6, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 72
    .line 73
    .line 74
    if-ne v6, v8, :cond_3

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move-object v0, v6

    .line 78
    move-object v6, p1

    .line 79
    move-object p1, v0

    .line 80
    move-object v0, v4

    .line 81
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    iput p1, v0, Lca6;->X:I

    .line 88
    .line 89
    iput-object v7, p0, Lhb1;->i0:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v7, p0, Lhb1;->g0:Lca6;

    .line 92
    .line 93
    iput-byte v5, p0, Lhb1;->h0:B

    .line 94
    .line 95
    iget-object p1, v6, Lk92;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-nez p1, :cond_8

    .line 102
    .line 103
    iget-object p1, v6, Lk92;->a:Ljava/io/File;

    .line 104
    .line 105
    new-instance v0, Lba2;

    .line 106
    .line 107
    invoke-direct {v0, v6, v2, v7}, Lba2;-><init>(Lca2;Ljava/lang/Object;Lq51;)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1, v0, p0}, Lw39;->k0(Ljava/io/File;Lgn2;Ls51;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-ne p1, v8, :cond_4

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    move-object p1, v1

    .line 118
    :goto_1
    if-ne p1, v8, :cond_5

    .line 119
    .line 120
    :goto_2
    return-object v8

    .line 121
    :cond_5
    :goto_3
    iget-boolean p0, p0, Lhb1;->m0:Z

    .line 122
    .line 123
    if-eqz p0, :cond_7

    .line 124
    .line 125
    iget-object p0, v3, Lib1;->j0:Ljb1;

    .line 126
    .line 127
    new-instance p1, Lv91;

    .line 128
    .line 129
    if-eqz v2, :cond_6

    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    goto :goto_4

    .line 136
    :cond_6
    const/4 v0, 0x0

    .line 137
    :goto_4
    iget v3, v4, Lca6;->X:I

    .line 138
    .line 139
    invoke-direct {p1, v0, v3, v2}, Lv91;-><init>(IILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, p1}, Ljb1;->c(Lhh7;)V

    .line 143
    .line 144
    .line 145
    :cond_7
    return-object v1

    .line 146
    :cond_8
    const-string p0, "This scope has already been closed."

    .line 147
    .line 148
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-object v7
.end method
