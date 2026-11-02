.class final Lhj;
.super Lqx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lqx4;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00030\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Lhj;",
        "S",
        "Lqx4;",
        "Lkj;",
        "animation"
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
.field public final X:Lsd8;

.field public final Y:Ly05;

.field public final Z:Llj;


# direct methods
.method public constructor <init>(Lsd8;Ly05;Llj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhj;->X:Lsd8;

    .line 5
    .line 6
    iput-object p2, p0, Lhj;->Y:Ly05;

    .line 7
    .line 8
    iput-object p3, p0, Lhj;->Z:Llj;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ljx4;
    .locals 3

    .line 1
    new-instance v0, Lkj;

    .line 2
    .line 3
    iget-object v1, p0, Lhj;->Y:Ly05;

    .line 4
    .line 5
    iget-object v2, p0, Lhj;->Z:Llj;

    .line 6
    .line 7
    iget-object p0, p0, Lhj;->X:Lsd8;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2}, Lkj;-><init>(Lsd8;Ly05;Llj;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final c(Ljx4;)V
    .locals 1

    .line 1
    check-cast p1, Lkj;

    .line 2
    .line 3
    iget-object v0, p0, Lhj;->X:Lsd8;

    .line 4
    .line 5
    iput-object v0, p1, Lkj;->r0:Lsd8;

    .line 6
    .line 7
    iget-object v0, p0, Lhj;->Y:Ly05;

    .line 8
    .line 9
    iput-object v0, p1, Lkj;->s0:Ly05;

    .line 10
    .line 11
    iget-object p0, p0, Lhj;->Z:Llj;

    .line 12
    .line 13
    iput-object p0, p1, Lkj;->t0:Llj;

    .line 14
    .line 15
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lhj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lhj;

    .line 6
    .line 7
    iget-object v0, p1, Lhj;->X:Lsd8;

    .line 8
    .line 9
    iget-object v1, p0, Lhj;->X:Lsd8;

    .line 10
    .line 11
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lhj;->Y:Ly05;

    .line 18
    .line 19
    iget-object p0, p0, Lhj;->Y:Ly05;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lhj;->Z:Llj;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lhj;->X:Lsd8;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object p0, p0, Lhj;->Y:Ly05;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method
