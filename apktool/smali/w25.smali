.class final Lw25;
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
        "Lw25;",
        "Lqx4;",
        "Lz25;",
        "ui"
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
.field public final X:Lt25;


# direct methods
.method public constructor <init>(Lt25;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw25;->X:Lt25;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljx4;
    .locals 2

    .line 1
    new-instance v0, Lz25;

    .line 2
    .line 3
    iget-object p0, p0, Lw25;->X:Lt25;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, v1}, Lz25;-><init>(Lt25;Lz47;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final c(Ljx4;)V
    .locals 2

    .line 1
    check-cast p1, Lz25;

    .line 2
    .line 3
    iget-object p0, p0, Lw25;->X:Lt25;

    .line 4
    .line 5
    iput-object p0, p1, Lz25;->q0:Lt25;

    .line 6
    .line 7
    iget-object p0, p1, Lz25;->r0:Lz47;

    .line 8
    .line 9
    iget-object v0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lz25;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-ne v0, p1, :cond_0

    .line 15
    .line 16
    iput-object v1, p0, Lz47;->Y:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object v1, p0, Lz47;->g0:Ljava/lang/Object;

    .line 19
    .line 20
    sget-object v0, Lzc1;->b:Ldw4;

    .line 21
    .line 22
    iput-object v0, p0, Lz47;->f0:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_0
    new-instance p0, Lz47;

    .line 25
    .line 26
    const/16 v0, 0x19

    .line 27
    .line 28
    invoke-direct {p0, v0}, Lz47;-><init>(B)V

    .line 29
    .line 30
    .line 31
    iput-object p0, p1, Lz25;->r0:Lz47;

    .line 32
    .line 33
    iget-boolean v0, p1, Ljx4;->p0:Z

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iput-object p1, p0, Lz47;->Y:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object v1, p0, Lz47;->Z:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object v1, p1, Lz25;->s0:Lz25;

    .line 42
    .line 43
    new-instance v0, Ltb2;

    .line 44
    .line 45
    const/16 v1, 0x18

    .line 46
    .line 47
    invoke-direct {v0, p1, v1}, Ltb2;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lz47;->f0:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljx4;->M0()Lb71;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lz47;->g0:Ljava/lang/Object;

    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lw25;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Lw25;

    .line 7
    .line 8
    iget-object p1, p1, Lw25;->X:Lt25;

    .line 9
    .line 10
    iget-object p0, p0, Lw25;->X:Lt25;

    .line 11
    .line 12
    invoke-static {p1, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lw25;->X:Lt25;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x1f

    .line 8
    .line 9
    return p0
.end method
