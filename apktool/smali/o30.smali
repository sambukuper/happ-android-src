.class public final synthetic Lo30;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:Lkd8;

.field public final synthetic Y:Lde3;

.field public final synthetic Z:Lr68;

.field public final synthetic f0:Lez2;

.field public final synthetic g0:Liu0;

.field public final synthetic h0:Lfi1;

.field public final synthetic i0:Z


# direct methods
.method public synthetic constructor <init>(Lkd8;Lde3;Lr68;Lez2;Liu0;Lu30;Lfi1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo30;->X:Lkd8;

    .line 5
    .line 6
    iput-object p2, p0, Lo30;->Y:Lde3;

    .line 7
    .line 8
    iput-object p3, p0, Lo30;->Z:Lr68;

    .line 9
    .line 10
    iput-object p4, p0, Lo30;->f0:Lez2;

    .line 11
    .line 12
    iput-object p5, p0, Lo30;->g0:Liu0;

    .line 13
    .line 14
    iput-object p7, p0, Lo30;->h0:Lfi1;

    .line 15
    .line 16
    iput-boolean p8, p0, Lo30;->i0:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lo30;->X:Lkd8;

    .line 2
    .line 3
    iget-object v1, p0, Lo30;->Y:Lde3;

    .line 4
    .line 5
    iput-object v1, v0, Lkd8;->b:Lde3;

    .line 6
    .line 7
    iget-object v0, p0, Lo30;->Z:Lr68;

    .line 8
    .line 9
    iget-boolean v1, p0, Lo30;->i0:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lr68;->r()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v2, p0, Lo30;->f0:Lez2;

    .line 17
    .line 18
    iput-object v2, v0, Lr68;->j:Lez2;

    .line 19
    .line 20
    iget-object v2, p0, Lo30;->g0:Liu0;

    .line 21
    .line 22
    iput-object v2, v0, Lr68;->g:Liu0;

    .line 23
    .line 24
    iget-object p0, p0, Lo30;->h0:Lfi1;

    .line 25
    .line 26
    iput-object p0, v0, Lr68;->c:Lfi1;

    .line 27
    .line 28
    iput-boolean v1, v0, Lr68;->i:Z

    .line 29
    .line 30
    sget-object p0, Ldn8;->a:Ldn8;

    .line 31
    .line 32
    return-object p0
.end method
