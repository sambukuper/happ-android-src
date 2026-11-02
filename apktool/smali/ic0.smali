.class public final Lic0;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lw85;
.implements Lea0;
.implements Lrv1;


# instance fields
.field public final q0:Ljc0;

.field public r0:Z

.field public s0:Lgn2;


# direct methods
.method public constructor <init>(Ljc0;Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljx4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lic0;->q0:Ljc0;

    .line 5
    .line 6
    iput-object p2, p0, Lic0;->s0:Lgn2;

    .line 7
    .line 8
    iput-object p0, p1, Ljc0;->X:Lea0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final O()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lic0;->Y0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final R0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final S0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lic0;->Y0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final V()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lic0;->Y0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Y0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lic0;->r0:Z

    .line 3
    .line 4
    iget-object v0, p0, Lic0;->q0:Ljc0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Ljc0;->Y:Lvk1;

    .line 8
    .line 9
    invoke-static {p0}, Lz68;->W(Lrv1;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final c()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lic0;->Y0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final e()J
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {p0, v0}, Lyn0;->X(Lnh1;I)Li55;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget-wide v0, p0, Leo5;->Z:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Lu15;->R(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final getDensity()Lfi1;
    .locals 0

    .line 1
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getLayoutDirection()Lz24;
    .locals 0

    .line 1
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 6
    .line 7
    return-object p0
.end method

.method public final q0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lic0;->Y0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final u0(Lp34;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lic0;->r0:Z

    .line 2
    .line 3
    iget-object v1, p0, Lic0;->q0:Ljc0;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, v1, Ljc0;->Y:Lvk1;

    .line 9
    .line 10
    new-instance v0, Lp5;

    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    invoke-direct {v0, p0, v1, v2}, Lp5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0}, Lch3;->N(Ljx4;Ldn2;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v1, Ljc0;->Y:Lvk1;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lic0;->r0:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p0, "DrawResult not defined, did you forget to call onDraw?"

    .line 29
    .line 30
    invoke-static {p0}, Lp61;->j(Ljava/lang/String;)Lo14;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    throw p0

    .line 35
    :cond_1
    :goto_0
    iget-object p0, v1, Ljc0;->Y:Lvk1;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lvk1;->Y:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lgn2;

    .line 43
    .line 44
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-void
.end method
