.class public final synthetic Lwe;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lzy0;

.field public final synthetic Y:Ldn2;

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:Lrn2;

.field public final synthetic g0:Z

.field public final synthetic h0:Lqt4;

.field public final synthetic i0:Lgg5;


# direct methods
.method public synthetic constructor <init>(Lzy0;Ldn2;Lkx4;Lrn2;ZLqt4;Lgg5;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwe;->X:Lzy0;

    .line 5
    .line 6
    iput-object p2, p0, Lwe;->Y:Ldn2;

    .line 7
    .line 8
    iput-object p3, p0, Lwe;->Z:Lkx4;

    .line 9
    .line 10
    iput-object p4, p0, Lwe;->f0:Lrn2;

    .line 11
    .line 12
    iput-boolean p5, p0, Lwe;->g0:Z

    .line 13
    .line 14
    iput-object p6, p0, Lwe;->h0:Lqt4;

    .line 15
    .line 16
    iput-object p7, p0, Lwe;->i0:Lgg5;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p1, 0xc00007

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lw79;->P(I)I

    .line 13
    .line 14
    .line 15
    move-result v8

    .line 16
    iget-object v0, p0, Lwe;->X:Lzy0;

    .line 17
    .line 18
    iget-object v1, p0, Lwe;->Y:Ldn2;

    .line 19
    .line 20
    iget-object v2, p0, Lwe;->Z:Lkx4;

    .line 21
    .line 22
    iget-object v3, p0, Lwe;->f0:Lrn2;

    .line 23
    .line 24
    iget-boolean v4, p0, Lwe;->g0:Z

    .line 25
    .line 26
    iget-object v5, p0, Lwe;->h0:Lqt4;

    .line 27
    .line 28
    iget-object v6, p0, Lwe;->i0:Lgg5;

    .line 29
    .line 30
    invoke-static/range {v0 .. v8}, Lye;->b(Lzy0;Ldn2;Lkx4;Lrn2;ZLqt4;Lgg5;Llp2;I)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Ldn8;->a:Ldn8;

    .line 34
    .line 35
    return-object p0
.end method
