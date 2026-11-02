.class final Landroidx/compose/foundation/layout/a;
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
        "Landroidx/compose/foundation/layout/a;",
        "Lqx4;",
        "Lza7;",
        "foundation-layout"
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
.field public final X:F

.field public final Y:F

.field public final Z:F

.field public final f0:F

.field public final g0:Z


# direct methods
.method public constructor <init>(FFFFZ)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput p1, p0, Landroidx/compose/foundation/layout/a;->X:F

    .line 29
    iput p2, p0, Landroidx/compose/foundation/layout/a;->Y:F

    .line 30
    iput p3, p0, Landroidx/compose/foundation/layout/a;->Z:F

    .line 31
    iput p4, p0, Landroidx/compose/foundation/layout/a;->f0:F

    .line 32
    iput-boolean p5, p0, Landroidx/compose/foundation/layout/a;->g0:Z

    return-void
.end method

.method public constructor <init>(FFFFZI)V
    .locals 2

    .line 1
    and-int/lit8 v0, p6, 0x1

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move p1, v1

    .line 8
    :cond_0
    and-int/lit8 v0, p6, 0x2

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move p2, v1

    .line 13
    :cond_1
    and-int/lit8 v0, p6, 0x4

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    move p3, v1

    .line 18
    :cond_2
    and-int/lit8 p6, p6, 0x8

    .line 19
    .line 20
    if-eqz p6, :cond_3

    .line 21
    .line 22
    move p4, v1

    .line 23
    :cond_3
    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/layout/a;-><init>(FFFFZ)V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a()Ljx4;
    .locals 2

    .line 1
    new-instance v0, Lza7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljx4;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Landroidx/compose/foundation/layout/a;->X:F

    .line 7
    .line 8
    iput v1, v0, Lza7;->q0:F

    .line 9
    .line 10
    iget v1, p0, Landroidx/compose/foundation/layout/a;->Y:F

    .line 11
    .line 12
    iput v1, v0, Lza7;->r0:F

    .line 13
    .line 14
    iget v1, p0, Landroidx/compose/foundation/layout/a;->Z:F

    .line 15
    .line 16
    iput v1, v0, Lza7;->s0:F

    .line 17
    .line 18
    iget v1, p0, Landroidx/compose/foundation/layout/a;->f0:F

    .line 19
    .line 20
    iput v1, v0, Lza7;->t0:F

    .line 21
    .line 22
    iget-boolean p0, p0, Landroidx/compose/foundation/layout/a;->g0:Z

    .line 23
    .line 24
    iput-boolean p0, v0, Lza7;->u0:Z

    .line 25
    .line 26
    return-object v0
.end method

.method public final c(Ljx4;)V
    .locals 1

    .line 1
    check-cast p1, Lza7;

    .line 2
    .line 3
    iget v0, p0, Landroidx/compose/foundation/layout/a;->X:F

    .line 4
    .line 5
    iput v0, p1, Lza7;->q0:F

    .line 6
    .line 7
    iget v0, p0, Landroidx/compose/foundation/layout/a;->Y:F

    .line 8
    .line 9
    iput v0, p1, Lza7;->r0:F

    .line 10
    .line 11
    iget v0, p0, Landroidx/compose/foundation/layout/a;->Z:F

    .line 12
    .line 13
    iput v0, p1, Lza7;->s0:F

    .line 14
    .line 15
    iget v0, p0, Landroidx/compose/foundation/layout/a;->f0:F

    .line 16
    .line 17
    iput v0, p1, Lza7;->t0:F

    .line 18
    .line 19
    iget-boolean p0, p0, Landroidx/compose/foundation/layout/a;->g0:Z

    .line 20
    .line 21
    iput-boolean p0, p1, Lza7;->u0:Z

    .line 22
    .line 23
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/layout/a;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Landroidx/compose/foundation/layout/a;

    .line 10
    .line 11
    iget v0, p1, Landroidx/compose/foundation/layout/a;->X:F

    .line 12
    .line 13
    iget v1, p0, Landroidx/compose/foundation/layout/a;->X:F

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkt1;->b(FF)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget v0, p0, Landroidx/compose/foundation/layout/a;->Y:F

    .line 23
    .line 24
    iget v1, p1, Landroidx/compose/foundation/layout/a;->Y:F

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkt1;->b(FF)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget v0, p0, Landroidx/compose/foundation/layout/a;->Z:F

    .line 34
    .line 35
    iget v1, p1, Landroidx/compose/foundation/layout/a;->Z:F

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkt1;->b(FF)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget v0, p0, Landroidx/compose/foundation/layout/a;->f0:F

    .line 45
    .line 46
    iget v1, p1, Landroidx/compose/foundation/layout/a;->f0:F

    .line 47
    .line 48
    invoke-static {v0, v1}, Lkt1;->b(FF)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-boolean p0, p0, Landroidx/compose/foundation/layout/a;->g0:Z

    .line 56
    .line 57
    iget-boolean p1, p1, Landroidx/compose/foundation/layout/a;->g0:Z

    .line 58
    .line 59
    if-eq p0, p1, :cond_6

    .line 60
    .line 61
    :goto_0
    const/4 p0, 0x0

    .line 62
    return p0

    .line 63
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 64
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Landroidx/compose/foundation/layout/a;->X:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Landroidx/compose/foundation/layout/a;->Y:F

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Lpc6;->d(IFI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Landroidx/compose/foundation/layout/a;->Z:F

    .line 17
    .line 18
    invoke-static {v0, v2, v1}, Lpc6;->d(IFI)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Landroidx/compose/foundation/layout/a;->f0:F

    .line 23
    .line 24
    invoke-static {v0, v2, v1}, Lpc6;->d(IFI)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean p0, p0, Landroidx/compose/foundation/layout/a;->g0:Z

    .line 29
    .line 30
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method
