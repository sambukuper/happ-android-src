.class public final synthetic Lmg;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lv30;

.field public final synthetic Y:Z

.field public final synthetic Z:Llf6;

.field public final synthetic f0:Z

.field public final synthetic g0:J

.field public final synthetic h0:F

.field public final synthetic i0:Lkx4;


# direct methods
.method public synthetic constructor <init>(Lv30;ZLlf6;ZJFLkx4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmg;->X:Lv30;

    .line 5
    .line 6
    iput-boolean p2, p0, Lmg;->Y:Z

    .line 7
    .line 8
    iput-object p3, p0, Lmg;->Z:Llf6;

    .line 9
    .line 10
    iput-boolean p4, p0, Lmg;->f0:Z

    .line 11
    .line 12
    iput-wide p5, p0, Lmg;->g0:J

    .line 13
    .line 14
    iput p7, p0, Lmg;->h0:F

    .line 15
    .line 16
    iput-object p8, p0, Lmg;->i0:Lkx4;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/16 p1, 0x6031

    .line 10
    .line 11
    invoke-static {p1}, Lw79;->P(I)I

    .line 12
    .line 13
    .line 14
    move-result v9

    .line 15
    iget-object v0, p0, Lmg;->X:Lv30;

    .line 16
    .line 17
    iget-boolean v1, p0, Lmg;->Y:Z

    .line 18
    .line 19
    iget-object v2, p0, Lmg;->Z:Llf6;

    .line 20
    .line 21
    iget-boolean v3, p0, Lmg;->f0:Z

    .line 22
    .line 23
    iget-wide v4, p0, Lmg;->g0:J

    .line 24
    .line 25
    iget v6, p0, Lmg;->h0:F

    .line 26
    .line 27
    iget-object v7, p0, Lmg;->i0:Lkx4;

    .line 28
    .line 29
    invoke-static/range {v0 .. v9}, Lw45;->g(Lv30;ZLlf6;ZJFLkx4;Llp2;I)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Ldn8;->a:Ldn8;

    .line 33
    .line 34
    return-object p0
.end method
