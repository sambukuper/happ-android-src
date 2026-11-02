.class final Ltz2;
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
        "Ltz2;",
        "Lqx4;",
        "Lvz2;",
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

.field public final Y:I

.field public final Z:I


# direct methods
.method public constructor <init>(Lo88;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltz2;->X:Lo88;

    .line 5
    .line 6
    iput p2, p0, Ltz2;->Y:I

    .line 7
    .line 8
    iput p3, p0, Ltz2;->Z:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ljx4;
    .locals 2

    .line 1
    new-instance v0, Lvz2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljx4;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ltz2;->X:Lo88;

    .line 7
    .line 8
    iput-object v1, v0, Lvz2;->q0:Lo88;

    .line 9
    .line 10
    iget v1, p0, Ltz2;->Y:I

    .line 11
    .line 12
    iput v1, v0, Lvz2;->r0:I

    .line 13
    .line 14
    iget p0, p0, Ltz2;->Z:I

    .line 15
    .line 16
    iput p0, v0, Lvz2;->s0:I

    .line 17
    .line 18
    const/4 p0, -0x1

    .line 19
    iput p0, v0, Lvz2;->u0:I

    .line 20
    .line 21
    iput p0, v0, Lvz2;->v0:I

    .line 22
    .line 23
    return-object v0
.end method

.method public final c(Ljx4;)V
    .locals 3

    .line 1
    check-cast p1, Lvz2;

    .line 2
    .line 3
    iget-object v0, p1, Lvz2;->q0:Lo88;

    .line 4
    .line 5
    iget-object v1, p0, Ltz2;->X:Lo88;

    .line 6
    .line 7
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v2, p0, Ltz2;->Y:I

    .line 12
    .line 13
    iget p0, p0, Ltz2;->Z:I

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget v0, p1, Lvz2;->r0:I

    .line 18
    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    iget v0, p1, Lvz2;->s0:I

    .line 22
    .line 23
    if-eq v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    :goto_0
    iput-object v1, p1, Lvz2;->q0:Lo88;

    .line 28
    .line 29
    iput v2, p1, Lvz2;->r0:I

    .line 30
    .line 31
    iput p0, p1, Lvz2;->s0:I

    .line 32
    .line 33
    invoke-static {p1}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object p0, p0, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 38
    .line 39
    invoke-static {v1, p0}, Lxt7;->d(Lo88;Lz24;)Lo88;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iput-object p0, p1, Lvz2;->w0:Lo88;

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    iput-boolean p0, p1, Lvz2;->t0:Z

    .line 47
    .line 48
    invoke-static {p1}, Lnr4;->E(Lg34;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ltz2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Ltz2;

    .line 12
    .line 13
    iget-object v1, p1, Ltz2;->X:Lo88;

    .line 14
    .line 15
    iget-object v3, p0, Ltz2;->X:Lo88;

    .line 16
    .line 17
    invoke-static {v3, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget v1, p0, Ltz2;->Y:I

    .line 25
    .line 26
    iget v3, p1, Ltz2;->Y:I

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget p0, p0, Ltz2;->Z:I

    .line 32
    .line 33
    iget p1, p1, Ltz2;->Z:I

    .line 34
    .line 35
    if-eq p0, p1, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Ltz2;->X:Lo88;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo88;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Ltz2;->Y:I

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget p0, p0, Ltz2;->Z:I

    .line 15
    .line 16
    add-int/2addr v0, p0

    .line 17
    return v0
.end method
