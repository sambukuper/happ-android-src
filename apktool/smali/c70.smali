.class public final Lc70;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0081\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Lc70;",
        "Lqx4;",
        "Lb70;",
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
.field public final X:F

.field public final Y:Lfe7;

.field public final Z:Lx67;


# direct methods
.method public constructor <init>(FLfe7;Lx67;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lc70;->X:F

    .line 5
    .line 6
    iput-object p2, p0, Lc70;->Y:Lfe7;

    .line 7
    .line 8
    iput-object p3, p0, Lc70;->Z:Lx67;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ljx4;
    .locals 3

    .line 1
    new-instance v0, Lb70;

    .line 2
    .line 3
    iget-object v1, p0, Lc70;->Y:Lfe7;

    .line 4
    .line 5
    iget-object v2, p0, Lc70;->Z:Lx67;

    .line 6
    .line 7
    iget p0, p0, Lc70;->X:F

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2}, Lb70;-><init>(FLfe7;Lx67;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final c(Ljx4;)V
    .locals 3

    .line 1
    check-cast p1, Lb70;

    .line 2
    .line 3
    iget v0, p1, Lb70;->t0:F

    .line 4
    .line 5
    iget-object v1, p1, Lb70;->w0:Lic0;

    .line 6
    .line 7
    iget v2, p0, Lc70;->X:F

    .line 8
    .line 9
    invoke-static {v0, v2}, Lkt1;->b(FF)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iput v2, p1, Lb70;->t0:F

    .line 16
    .line 17
    invoke-virtual {v1}, Lic0;->Y0()V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p1, Lb70;->u0:Lfe7;

    .line 21
    .line 22
    iget-object v2, p0, Lc70;->Y:Lfe7;

    .line 23
    .line 24
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    iput-object v2, p1, Lb70;->u0:Lfe7;

    .line 31
    .line 32
    invoke-virtual {v1}, Lic0;->Y0()V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object v0, p1, Lb70;->v0:Lx67;

    .line 36
    .line 37
    iget-object p0, p0, Lc70;->Z:Lx67;

    .line 38
    .line 39
    invoke-static {v0, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    iput-object p0, p1, Lb70;->v0:Lx67;

    .line 46
    .line 47
    invoke-virtual {v1}, Lic0;->Y0()V

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Lch3;->I(Lw07;)V

    .line 51
    .line 52
    .line 53
    :cond_2
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
    instance-of v0, p1, Lc70;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lc70;

    .line 10
    .line 11
    iget v0, p0, Lc70;->X:F

    .line 12
    .line 13
    iget v1, p1, Lc70;->X:F

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkt1;->b(FF)Z

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
    iget-object v0, p0, Lc70;->Y:Lfe7;

    .line 23
    .line 24
    iget-object v1, p1, Lc70;->Y:Lfe7;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lfe7;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lc70;->Z:Lx67;

    .line 34
    .line 35
    iget-object p1, p1, Lc70;->Z:Lx67;

    .line 36
    .line 37
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 46
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lc70;->X:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lc70;->Y:Lfe7;

    .line 10
    .line 11
    invoke-virtual {v1}, Lfe7;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object p0, p0, Lc70;->Z:Lx67;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v1

    .line 25
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lc70;->X:F

    .line 2
    .line 3
    invoke-static {v0}, Lkt1;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "BorderModifierNodeElement(width="

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, ", brush="

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lc70;->Y:Lfe7;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ", shape="

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lc70;->Z:Lx67;

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, ")"

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method
