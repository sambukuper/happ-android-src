.class public final Lay6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lny6;


# static fields
.field public static final n0:Lxd6;


# instance fields
.field public final X:Loh5;

.field public final Y:Loh5;

.field public final Z:Loh5;

.field public final f0:Lrh5;

.field public final g0:Lxz4;

.field public final h0:Loh5;

.field public i0:F

.field public final j0:Lfu6;

.field public final k0:Llr5;

.field public final l0:Lzi1;

.field public final m0:Lzi1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lew6;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Lew6;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lzx6;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v2}, Lzx6;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lxd6;

    .line 14
    .line 15
    const/4 v3, 0x6

    .line 16
    invoke-direct {v2, v0, v1, v3}, Lxd6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    sput-object v2, Lay6;->n0:Lxd6;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Loh5;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Loh5;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lay6;->X:Loh5;

    .line 10
    .line 11
    new-instance p1, Loh5;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, Loh5;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lay6;->Y:Loh5;

    .line 18
    .line 19
    new-instance p1, Loh5;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Loh5;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lay6;->Z:Loh5;

    .line 25
    .line 26
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lay6;->f0:Lrh5;

    .line 33
    .line 34
    new-instance p1, Lxz4;

    .line 35
    .line 36
    invoke-direct {p1}, Lxz4;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lay6;->g0:Lxz4;

    .line 40
    .line 41
    new-instance p1, Loh5;

    .line 42
    .line 43
    const v1, 0x7fffffff

    .line 44
    .line 45
    .line 46
    invoke-direct {p1, v1}, Loh5;-><init>(I)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lay6;->h0:Loh5;

    .line 50
    .line 51
    new-instance p1, Lt16;

    .line 52
    .line 53
    const/16 v1, 0xc

    .line 54
    .line 55
    invoke-direct {p1, p0, v1}, Lt16;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    new-instance v1, Lfu6;

    .line 59
    .line 60
    invoke-direct {v1, p1}, Lfu6;-><init>(Lgn2;)V

    .line 61
    .line 62
    .line 63
    iput-object v1, p0, Lay6;->j0:Lfu6;

    .line 64
    .line 65
    new-instance p1, Llr5;

    .line 66
    .line 67
    const/16 v1, 0xb

    .line 68
    .line 69
    invoke-direct {p1, p0, v1}, Llr5;-><init>(Ljava/lang/Object;B)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lay6;->k0:Llr5;

    .line 73
    .line 74
    new-instance p1, Lyx6;

    .line 75
    .line 76
    invoke-direct {p1, p0, v0}, Lyx6;-><init>(Lay6;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, Lrd7;->b(Ldn2;)Lzi1;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lay6;->l0:Lzi1;

    .line 84
    .line 85
    new-instance p1, Lyx6;

    .line 86
    .line 87
    const/4 v0, 0x1

    .line 88
    invoke-direct {p1, p0, v0}, Lyx6;-><init>(Lay6;B)V

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Lrd7;->b(Ldn2;)Lzi1;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, p0, Lay6;->m0:Lzi1;

    .line 96
    .line 97
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lay6;->X:Loh5;

    .line 2
    .line 3
    iget-object p0, p0, Lay6;->h0:Loh5;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Loh5;->m(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lyn0;->D()Ldd7;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Ldd7;->e()Lgn2;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    invoke-static {p0}, Lyn0;->P(Ldd7;)Ldd7;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :try_start_0
    invoke-virtual {v0}, Loh5;->l()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-le v3, p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Loh5;->m(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    :goto_1
    invoke-static {p0, v2, v1}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :goto_2
    invoke-static {p0, v2, v1}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 41
    .line 42
    .line 43
    throw p1
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lay6;->j0:Lfu6;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfu6;->b()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final i(Lf15;Lrn2;Lq51;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lay6;->j0:Lfu6;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lfu6;->i(Lf15;Lrn2;Lq51;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lc71;->X:Lc71;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 13
    .line 14
    return-object p0
.end method

.method public final j()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lay6;->m0:Lzi1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzi1;->getValue()Ljava/lang/Object;

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

.method public final m()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lay6;->l0:Lzi1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzi1;->getValue()Ljava/lang/Object;

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

.method public final n(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lay6;->j0:Lfu6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lfu6;->n(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final o()Ltx6;
    .locals 0

    .line 1
    iget-object p0, p0, Lay6;->k0:Llr5;

    .line 2
    .line 3
    return-object p0
.end method
