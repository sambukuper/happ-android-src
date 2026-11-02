.class public final synthetic Lsy2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Z

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Lke1;

.field public final synthetic f0:Lzy0;

.field public final synthetic g0:Lkx4;

.field public final synthetic h0:Lla;

.field public final synthetic i0:Z

.field public final synthetic j0:Lgn2;

.field public final synthetic k0:Lgn2;

.field public final synthetic l0:Lzy0;

.field public final synthetic m0:I


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/Object;Lke1;Lzy0;Lkx4;Lla;ZLgn2;Lgn2;Lzy0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lsy2;->X:Z

    .line 5
    .line 6
    iput-object p2, p0, Lsy2;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lsy2;->Z:Lke1;

    .line 9
    .line 10
    iput-object p4, p0, Lsy2;->f0:Lzy0;

    .line 11
    .line 12
    iput-object p5, p0, Lsy2;->g0:Lkx4;

    .line 13
    .line 14
    iput-object p6, p0, Lsy2;->h0:Lla;

    .line 15
    .line 16
    iput-boolean p7, p0, Lsy2;->i0:Z

    .line 17
    .line 18
    iput-object p8, p0, Lsy2;->j0:Lgn2;

    .line 19
    .line 20
    iput-object p9, p0, Lsy2;->k0:Lgn2;

    .line 21
    .line 22
    iput-object p10, p0, Lsy2;->l0:Lzy0;

    .line 23
    .line 24
    iput p11, p0, Lsy2;->m0:I

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v10, p1

    .line 2
    check-cast v10, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lsy2;->m0:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v11

    .line 17
    iget-boolean v0, p0, Lsy2;->X:Z

    .line 18
    .line 19
    iget-object v1, p0, Lsy2;->Y:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v2, p0, Lsy2;->Z:Lke1;

    .line 22
    .line 23
    iget-object v3, p0, Lsy2;->f0:Lzy0;

    .line 24
    .line 25
    iget-object v4, p0, Lsy2;->g0:Lkx4;

    .line 26
    .line 27
    iget-object v5, p0, Lsy2;->h0:Lla;

    .line 28
    .line 29
    iget-boolean v6, p0, Lsy2;->i0:Z

    .line 30
    .line 31
    iget-object v7, p0, Lsy2;->j0:Lgn2;

    .line 32
    .line 33
    iget-object v8, p0, Lsy2;->k0:Lgn2;

    .line 34
    .line 35
    iget-object v9, p0, Lsy2;->l0:Lzy0;

    .line 36
    .line 37
    invoke-static/range {v0 .. v11}, Lw51;->b(ZLjava/lang/Object;Lke1;Lzy0;Lkx4;Lla;ZLgn2;Lgn2;Lzy0;Llp2;I)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Ldn8;->a:Ldn8;

    .line 41
    .line 42
    return-object p0
.end method
