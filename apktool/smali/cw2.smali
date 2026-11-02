.class public final synthetic Lcw2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Ldn2;

.field public final synthetic Y:Z

.field public final synthetic Z:Z

.field public final synthetic f0:Lzy0;

.field public final synthetic g0:I


# direct methods
.method public synthetic constructor <init>(Ldn2;ZZLzy0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcw2;->X:Ldn2;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcw2;->Y:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lcw2;->Z:Z

    .line 9
    .line 10
    iput-object p4, p0, Lcw2;->f0:Lzy0;

    .line 11
    .line 12
    iput p5, p0, Lcw2;->g0:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lcw2;->g0:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget-object v0, p0, Lcw2;->X:Ldn2;

    .line 18
    .line 19
    iget-boolean v1, p0, Lcw2;->Y:Z

    .line 20
    .line 21
    iget-boolean v2, p0, Lcw2;->Z:Z

    .line 22
    .line 23
    iget-object v3, p0, Lcw2;->f0:Lzy0;

    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, Lvr3;->b(Ldn2;ZZLzy0;Llp2;I)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Ldn8;->a:Ldn8;

    .line 29
    .line 30
    return-object p0
.end method
