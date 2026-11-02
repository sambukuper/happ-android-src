.class final Lw68;
.super Lqx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lqx4;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Lw68;",
        "Lqx4;",
        "Lx68;",
        "foundation"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final X:Lo88;


# direct methods
.method public constructor <init>(Lo88;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw68;->X:Lo88;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljx4;
    .locals 1

    .line 1
    new-instance v0, Lx68;

    .line 2
    .line 3
    iget-object p0, p0, Lw68;->X:Lo88;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lx68;-><init>(Lo88;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final c(Ljx4;)V
    .locals 3

    .line 1
    check-cast p1, Lx68;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 11
    .line 12
    iget-object p0, p0, Lw68;->X:Lo88;

    .line 13
    .line 14
    invoke-static {p0, v0}, Lxt7;->d(Lo88;Lz24;)Lo88;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object v0, Ly01;->k:Lox1;

    .line 19
    .line 20
    invoke-static {p1, v0}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lfi2;

    .line 25
    .line 26
    invoke-virtual {p1, p0, v0}, Lx68;->Y0(Lo88;Lfi2;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p1, Lx68;->s0:Lv68;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const/16 v1, 0x17

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-static {v0, v2, v2, p0, v1}, Lv68;->a(Lv68;Lz24;Lfi1;Lo88;I)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lnr4;->E(Lg34;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    const-string p0, "Min size state is not set."

    .line 44
    .line 45
    invoke-static {p0}, Lie2;->d(Ljava/lang/String;)Lo14;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    throw p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lw68;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lw68;

    .line 12
    .line 13
    iget-object p1, p1, Lw68;->X:Lo88;

    .line 14
    .line 15
    iget-object p0, p0, Lw68;->X:Lo88;

    .line 16
    .line 17
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lw68;->X:Lo88;

    .line 2
    .line 3
    invoke-virtual {p0}, Lo88;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
