.class public final Lwb3;
.super Loh1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ls01;


# instance fields
.field public A0:Loi;

.field public B0:Lx67;

.field public final C0:Loi;

.field public final D0:Lic0;

.field public s0:Z

.field public t0:Z

.field public u0:Lxz4;

.field public v0:F

.field public w0:F

.field public x0:Z

.field public y0:Log7;

.field public z0:Li48;


# direct methods
.method public constructor <init>(ZZLxz4;Li48;Lx67;FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loh1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lwb3;->s0:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lwb3;->t0:Z

    .line 7
    .line 8
    iput-object p3, p0, Lwb3;->u0:Lxz4;

    .line 9
    .line 10
    iput p6, p0, Lwb3;->v0:F

    .line 11
    .line 12
    iput p7, p0, Lwb3;->w0:F

    .line 13
    .line 14
    iput-object p4, p0, Lwb3;->z0:Li48;

    .line 15
    .line 16
    iput-object p5, p0, Lwb3;->B0:Lx67;

    .line 17
    .line 18
    new-instance p2, Loi;

    .line 19
    .line 20
    iget-boolean p3, p0, Lwb3;->x0:Z

    .line 21
    .line 22
    if-eqz p3, :cond_0

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move p6, p7

    .line 28
    :goto_0
    new-instance p1, Lkt1;

    .line 29
    .line 30
    invoke-direct {p1, p6}, Lkt1;-><init>(F)V

    .line 31
    .line 32
    .line 33
    sget-object p3, Lys0;->l0:Lug8;

    .line 34
    .line 35
    const/4 p4, 0x0

    .line 36
    const/16 p5, 0xc

    .line 37
    .line 38
    invoke-direct {p2, p1, p3, p4, p5}, Loi;-><init>(Ljava/lang/Object;Lug8;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, Lwb3;->C0:Loi;

    .line 42
    .line 43
    new-instance p1, Lvj2;

    .line 44
    .line 45
    const/4 p2, 0x7

    .line 46
    invoke-direct {p1, p0, p2}, Lvj2;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    new-instance p2, Lic0;

    .line 50
    .line 51
    new-instance p3, Ljc0;

    .line 52
    .line 53
    invoke-direct {p3}, Ljc0;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-direct {p2, p3, p1}, Lic0;-><init>(Ljc0;Lgn2;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p2}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 60
    .line 61
    .line 62
    iput-object p2, p0, Lwb3;->D0:Lic0;

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final N0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final Q0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lvb3;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    invoke-direct {v1, p0, v2, v3}, Lvb3;-><init>(Lwb3;Lq51;B)V

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x3

    .line 13
    invoke-static {v0, v2, v2, v1, v4}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lwb3;->y0:Log7;

    .line 18
    .line 19
    iget-object v0, p0, Lwb3;->A0:Loi;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lwb3;->z0:Li48;

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    sget-object v0, Lkw0;->a:Lox1;

    .line 28
    .line 29
    invoke-static {p0, v0}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Liw0;

    .line 34
    .line 35
    sget-object v1, Li88;->a:Lox1;

    .line 36
    .line 37
    invoke-static {p0, v1}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lh88;

    .line 42
    .line 43
    invoke-static {v0, v1}, Llh4;->O0(Liw0;Lh88;)Li48;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_0
    iget-boolean v1, p0, Lwb3;->s0:Z

    .line 48
    .line 49
    iget-boolean v4, p0, Lwb3;->t0:Z

    .line 50
    .line 51
    iget-boolean v5, p0, Lwb3;->x0:Z

    .line 52
    .line 53
    invoke-virtual {v0, v1, v4, v5}, Li48;->c(ZZZ)J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    new-instance v4, Loi;

    .line 58
    .line 59
    new-instance v5, Ldw0;

    .line 60
    .line 61
    invoke-direct {v5, v0, v1}, Ldw0;-><init>(J)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1}, Ldw0;->e(J)Llw0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget-object v1, Lti;->i0:Lti;

    .line 69
    .line 70
    new-instance v6, Lwi;

    .line 71
    .line 72
    invoke-direct {v6, v0, v3}, Lwi;-><init>(Ljava/lang/Object;B)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Lug8;

    .line 76
    .line 77
    invoke-direct {v0, v1, v6}, Lug8;-><init>(Lgn2;Lgn2;)V

    .line 78
    .line 79
    .line 80
    const/16 v1, 0xc

    .line 81
    .line 82
    invoke-direct {v4, v5, v0, v2, v1}, Loi;-><init>(Ljava/lang/Object;Lug8;Ljava/lang/Object;I)V

    .line 83
    .line 84
    .line 85
    iput-object v4, p0, Lwb3;->A0:Loi;

    .line 86
    .line 87
    :cond_1
    return-void
.end method

.method public final b1()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lvb3;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v3, v2}, Lvb3;-><init>(Lwb3;Lq51;B)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-static {v0, v3, v3, v1, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lvb3;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-direct {v1, p0, v3, v4}, Lvb3;-><init>(Lwb3;Lq51;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v3, v3, v1, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final c1(Luy7;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lwb3;->x0:Z

    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lwb3;->u0:Lxz4;

    .line 10
    .line 11
    iget-object v1, v1, Lxz4;->a:Lu77;

    .line 12
    .line 13
    new-instance v2, Lte0;

    .line 14
    .line 15
    const/4 v3, 0x7

    .line 16
    invoke-direct {v2, v0, p0, v3}, Lte0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2, p1}, Lu77;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lc71;->X:Lc71;

    .line 23
    .line 24
    return-object p0
.end method
