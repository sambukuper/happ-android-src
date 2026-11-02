.class public final Lz54;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lb71;

.field public final b:Lvt2;

.field public final c:Ltb2;

.field public d:Lta2;

.field public e:Lta2;

.field public f:Lta2;

.field public g:Z

.field public final h:Lrh5;

.field public final i:Lrh5;

.field public final j:Lrh5;

.field public final k:Lrh5;

.field public l:J

.field public m:J

.field public n:J

.field public o:Lxt2;

.field public final p:Loi;

.field public final q:Loi;

.field public final r:Lrh5;


# direct methods
.method public constructor <init>(Lb71;Lvt2;Ltb2;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz54;->a:Lb71;

    .line 5
    .line 6
    iput-object p2, p0, Lz54;->b:Lvt2;

    .line 7
    .line 8
    iput-object p3, p0, Lz54;->c:Ltb2;

    .line 9
    .line 10
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    iput-object p3, p0, Lz54;->h:Lrh5;

    .line 17
    .line 18
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    iput-object p3, p0, Lz54;->i:Lrh5;

    .line 23
    .line 24
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    iput-object p3, p0, Lz54;->j:Lrh5;

    .line 29
    .line 30
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lz54;->k:Lrh5;

    .line 35
    .line 36
    const-wide v0, 0x7fffffff7fffffffL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    iput-wide v0, p0, Lz54;->l:J

    .line 42
    .line 43
    const-wide/16 v2, 0x0

    .line 44
    .line 45
    iput-wide v2, p0, Lz54;->m:J

    .line 46
    .line 47
    iput-wide v0, p0, Lz54;->n:J

    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    if-eqz p2, :cond_0

    .line 51
    .line 52
    invoke-interface {p2}, Lvt2;->c()Lxt2;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move-object p2, p1

    .line 58
    :goto_0
    iput-object p2, p0, Lz54;->o:Lxt2;

    .line 59
    .line 60
    new-instance p2, Loi;

    .line 61
    .line 62
    new-instance p3, Lhf3;

    .line 63
    .line 64
    invoke-direct {p3, v2, v3}, Lhf3;-><init>(J)V

    .line 65
    .line 66
    .line 67
    sget-object v0, Lys0;->p0:Lug8;

    .line 68
    .line 69
    const/16 v1, 0xc

    .line 70
    .line 71
    invoke-direct {p2, p3, v0, p1, v1}, Loi;-><init>(Ljava/lang/Object;Lug8;Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    iput-object p2, p0, Lz54;->p:Loi;

    .line 75
    .line 76
    new-instance p2, Loi;

    .line 77
    .line 78
    const/high16 p3, 0x3f800000    # 1.0f

    .line 79
    .line 80
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    sget-object v0, Lys0;->j0:Lug8;

    .line 85
    .line 86
    invoke-direct {p2, p3, v0, p1, v1}, Loi;-><init>(Ljava/lang/Object;Lug8;Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    iput-object p2, p0, Lz54;->q:Loi;

    .line 90
    .line 91
    new-instance p1, Lhf3;

    .line 92
    .line 93
    invoke-direct {p1, v2, v3}, Lhf3;-><init>(J)V

    .line 94
    .line 95
    .line 96
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iput-object p1, p0, Lz54;->r:Lrh5;

    .line 101
    .line 102
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    .line 1
    iget-object v4, p0, Lz54;->o:Lxt2;

    .line 2
    .line 3
    iget-object v3, p0, Lz54;->d:Lta2;

    .line 4
    .line 5
    iget-object v0, p0, Lz54;->i:Lrh5;

    .line 6
    .line 7
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v6, 0x3

    .line 18
    iget-object v7, p0, Lz54;->a:Lb71;

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    if-nez v4, :cond_1

    .line 26
    .line 27
    :cond_0
    move-object v2, p0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lz54;->b()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    xor-int/lit8 v1, v0, 0x1

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {v4, v0}, Lxt2;->f(F)V

    .line 44
    .line 45
    .line 46
    :cond_2
    new-instance v0, Ly54;

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    move-object v2, p0

    .line 50
    invoke-direct/range {v0 .. v5}, Ly54;-><init>(ZLz54;Lta2;Lxt2;Lq51;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v7, v8, v8, v0, v6}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :goto_0
    invoke-virtual {v2}, Lz54;->b()Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_4

    .line 62
    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    const/high16 p0, 0x3f800000    # 1.0f

    .line 66
    .line 67
    invoke-virtual {v4, p0}, Lxt2;->f(F)V

    .line 68
    .line 69
    .line 70
    :cond_3
    new-instance p0, Lw54;

    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    invoke-direct {p0, v2, v8, v0}, Lw54;-><init>(Lz54;Lq51;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {v7, v8, v8, p0, v6}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 77
    .line 78
    .line 79
    :cond_4
    return-void
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lz54;->j:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lz54;->h:Lrh5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x3

    .line 14
    iget-object v3, p0, Lz54;->a:Lb71;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lw54;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-direct {v0, p0, v4, v1}, Lw54;-><init>(Lz54;Lq51;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4, v4, v0, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lz54;->i:Lrh5;

    .line 34
    .line 35
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Lw54;

    .line 53
    .line 54
    invoke-direct {v0, p0, v4, v2}, Lw54;-><init>(Lz54;Lq51;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v3, v4, v4, v0, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-virtual {p0}, Lz54;->b()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    iget-object v0, p0, Lz54;->j:Lrh5;

    .line 67
    .line 68
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    new-instance v0, Lw54;

    .line 74
    .line 75
    const/4 v1, 0x4

    .line 76
    invoke-direct {v0, p0, v4, v1}, Lw54;-><init>(Lz54;Lq51;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {v3, v4, v4, v0, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 80
    .line 81
    .line 82
    :cond_2
    const/4 v0, 0x0

    .line 83
    iput-boolean v0, p0, Lz54;->g:Z

    .line 84
    .line 85
    const-wide/16 v0, 0x0

    .line 86
    .line 87
    invoke-virtual {p0, v0, v1}, Lz54;->d(J)V

    .line 88
    .line 89
    .line 90
    const-wide v0, 0x7fffffff7fffffffL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    iput-wide v0, p0, Lz54;->l:J

    .line 96
    .line 97
    iget-object v0, p0, Lz54;->o:Lxt2;

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    iget-object v1, p0, Lz54;->b:Lvt2;

    .line 102
    .line 103
    if-eqz v1, :cond_3

    .line 104
    .line 105
    invoke-interface {v1, v0}, Lvt2;->a(Lxt2;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    iput-object v4, p0, Lz54;->o:Lxt2;

    .line 109
    .line 110
    iput-object v4, p0, Lz54;->d:Lta2;

    .line 111
    .line 112
    iput-object v4, p0, Lz54;->f:Lta2;

    .line 113
    .line 114
    iput-object v4, p0, Lz54;->e:Lta2;

    .line 115
    .line 116
    return-void
.end method

.method public final d(J)V
    .locals 1

    .line 1
    new-instance v0, Lhf3;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lhf3;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lz54;->r:Lrh5;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
