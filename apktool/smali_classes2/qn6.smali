.class public final synthetic Lqn6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lvo6;

.field public final synthetic Y:Z

.field public final synthetic Z:Z

.field public final synthetic f0:Z

.field public final synthetic g0:Lgn2;

.field public final synthetic h0:Lkx4;


# direct methods
.method public synthetic constructor <init>(Lvo6;ZZZLgn2;Lkx4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqn6;->X:Lvo6;

    .line 5
    .line 6
    iput-boolean p2, p0, Lqn6;->Y:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lqn6;->Z:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lqn6;->f0:Z

    .line 11
    .line 12
    iput-object p5, p0, Lqn6;->g0:Lgn2;

    .line 13
    .line 14
    iput-object p6, p0, Lqn6;->h0:Lkx4;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, Lw79;->P(I)I

    .line 11
    .line 12
    .line 13
    move-result v7

    .line 14
    iget-object v0, p0, Lqn6;->X:Lvo6;

    .line 15
    .line 16
    iget-boolean v1, p0, Lqn6;->Y:Z

    .line 17
    .line 18
    iget-boolean v2, p0, Lqn6;->Z:Z

    .line 19
    .line 20
    iget-boolean v3, p0, Lqn6;->f0:Z

    .line 21
    .line 22
    iget-object v4, p0, Lqn6;->g0:Lgn2;

    .line 23
    .line 24
    iget-object v5, p0, Lqn6;->h0:Lkx4;

    .line 25
    .line 26
    invoke-static/range {v0 .. v7}, Lz51;->h(Lvo6;ZZZLgn2;Lkx4;Llp2;I)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Ldn8;->a:Ldn8;

    .line 30
    .line 31
    return-object p0
.end method
