.class public final Lj64;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Llh7;


# instance fields
.field public final X:Lrh5;

.field public Y:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    div-int/lit8 v0, p1, 0x1e

    .line 5
    .line 6
    mul-int/lit8 v0, v0, 0x1e

    .line 7
    .line 8
    add-int/lit8 v1, v0, -0x64

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit16 v0, v0, 0x82

    .line 16
    .line 17
    invoke-static {v1, v0}, Lx97;->a0(II)Lkf3;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lqe4;->v0:Lqe4;

    .line 22
    .line 23
    new-instance v2, Lrh5;

    .line 24
    .line 25
    invoke-direct {v2, v0, v1}, Lrh5;-><init>(Ljava/lang/Object;Lqd7;)V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, Lj64;->X:Lrh5;

    .line 29
    .line 30
    iput p1, p0, Lj64;->Y:I

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lj64;->X:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkf3;

    .line 8
    .line 9
    return-object p0
.end method
