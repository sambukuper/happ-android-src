.class public final Lsm7;
.super Loh1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lkq5;
.implements Lvg2;
.implements Lqh2;


# instance fields
.field public s0:Ldn2;

.field public t0:Z

.field public final u0:Lcz7;


# direct methods
.method public constructor <init>(Ldn2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Loh1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsm7;->s0:Ldn2;

    .line 5
    .line 6
    new-instance p1, Lsd;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    invoke-direct {p1, p0, v0}, Lsd;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lyy7;->a:Laq5;

    .line 13
    .line 14
    new-instance v0, Lcz7;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1, v1, p1}, Lcz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lsm7;->u0:Lcz7;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final H(Lyh2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lyh2;->b()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput-boolean p1, p0, Lsm7;->t0:Z

    .line 6
    .line 7
    return-void
.end method

.method public final I()V
    .locals 0

    .line 1
    iget-object p0, p0, Lsm7;->u0:Lcz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcz7;->I()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final p()J
    .locals 4

    .line 1
    sget-object v0, Lz68;->j:Lot1;

    .line 2
    .line 3
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget v0, Lvc8;->b:I

    .line 13
    .line 14
    const/high16 v0, 0x41200000    # 10.0f

    .line 15
    .line 16
    invoke-interface {p0, v0}, Lfi1;->x0(F)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/high16 v2, 0x42200000    # 40.0f

    .line 21
    .line 22
    invoke-interface {p0, v2}, Lfi1;->x0(F)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-interface {p0, v0}, Lfi1;->x0(F)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-interface {p0, v2}, Lfi1;->x0(F)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {v1, v3, v0, p0}, Lz38;->c(IIII)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    return-wide v0
.end method

.method public final z(Laq5;Lbq5;J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lsm7;->u0:Lcz7;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcz7;->z(Laq5;Lbq5;J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
