.class public final Lkm8;
.super Llm8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lkm8;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, Lkm8;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public final c(Lac1;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, Lkm8;->a:I

    .line 3
    .line 4
    if-eq v1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne v1, v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Ldg5;->Y:Ldg5;

    .line 10
    .line 11
    invoke-interface {p1, p0}, Lac1;->c(Ldg5;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {p0}, Lvm8;->e(Lqm8;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    sget-object p0, Ldg5;->X:Ldg5;

    .line 21
    .line 22
    invoke-interface {p1, p0}, Lac1;->c(Ldg5;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
