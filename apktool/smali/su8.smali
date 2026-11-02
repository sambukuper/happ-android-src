.class public final Lsu8;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrv1;


# instance fields
.field public q0:Lsd8;

.field public r0:Lg22;

.field public s0:Lh62;

.field public t0:Lx77;


# virtual methods
.method public final u0(Lp34;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Lp34;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lsu8;->q0:Lsd8;

    .line 5
    .line 6
    new-instance v1, Lru8;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, p0, v2}, Lru8;-><init>(Lsu8;B)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lsu8;->t0:Lx77;

    .line 13
    .line 14
    invoke-virtual {v2}, Lx77;->a()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    iget-wide v2, v2, Lx77;->e:J

    .line 22
    .line 23
    new-instance v5, Ldw0;

    .line 24
    .line 25
    invoke-direct {v5, v2, v3}, Ldw0;-><init>(J)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v5, v4

    .line 30
    :goto_0
    new-instance v2, Lru8;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-direct {v2, p0, v3}, Lru8;-><init>(Lsu8;B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1, v5, v4, v2}, Lsd8;->a(Lgn2;Ljava/lang/Object;Lwk;Lgn2;)Lrd8;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v1, p0, Lsu8;->t0:Lx77;

    .line 41
    .line 42
    invoke-virtual {v0}, Lrd8;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ldw0;

    .line 47
    .line 48
    iget-wide v2, v0, Ldw0;->a:J

    .line 49
    .line 50
    iget-object v0, v1, Lx77;->c:Ld6;

    .line 51
    .line 52
    invoke-virtual {v1}, Lx77;->b()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    iget-object v4, v0, Ld6;->k0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, Lrh5;

    .line 61
    .line 62
    invoke-virtual {v4}, Lrh5;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_1

    .line 73
    .line 74
    iget-object v0, v0, Ld6;->f0:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lrh5;

    .line 77
    .line 78
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Ldw0;

    .line 83
    .line 84
    iget-wide v2, v0, Ldw0;->a:J

    .line 85
    .line 86
    :cond_1
    move-wide v5, v2

    .line 87
    invoke-virtual {v1}, Lx77;->b()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    iput-wide v5, v1, Lx77;->e:J

    .line 94
    .line 95
    :cond_2
    invoke-static {v5, v6}, Ldw0;->c(J)F

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const/4 v1, 0x0

    .line 100
    cmpg-float v0, v0, v1

    .line 101
    .line 102
    if-nez v0, :cond_3

    .line 103
    .line 104
    return-void

    .line 105
    :cond_3
    iget-object v0, p0, Lsu8;->r0:Lg22;

    .line 106
    .line 107
    iget-object v0, v0, Lg22;->a:Lbe8;

    .line 108
    .line 109
    iget-object p0, p0, Lsu8;->s0:Lh62;

    .line 110
    .line 111
    iget-object p0, p0, Lh62;->a:Lbe8;

    .line 112
    .line 113
    const/4 v11, 0x0

    .line 114
    const/16 v12, 0x7e

    .line 115
    .line 116
    const-wide/16 v7, 0x0

    .line 117
    .line 118
    const-wide/16 v9, 0x0

    .line 119
    .line 120
    move-object v4, p1

    .line 121
    invoke-static/range {v4 .. v12}, Lsv1;->k0(Lsv1;JJJFI)V

    .line 122
    .line 123
    .line 124
    return-void
.end method
