.class public final Ljh8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Lxi8;

.field public final d:Lw79;

.field public final e:Loc;

.field public f:I

.field public g:Ljava/util/ArrayDeque;

.field public h:Lpc7;


# direct methods
.method public constructor <init>(ZZZLxi8;Lw79;Loc;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, Ljh8;->a:Z

    .line 8
    .line 9
    iput-boolean p2, p0, Ljh8;->b:Z

    .line 10
    .line 11
    iput-object p4, p0, Ljh8;->c:Lxi8;

    .line 12
    .line 13
    iput-object p5, p0, Ljh8;->d:Lw79;

    .line 14
    .line 15
    iput-object p6, p0, Ljh8;->e:Loc;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljh8;->g:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Ljh8;->h:Lpc7;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lpc7;->clear()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljh8;->g:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayDeque;

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ljh8;->g:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ljh8;->h:Lpc7;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Lpc7;

    .line 18
    .line 19
    invoke-direct {v0}, Lh2;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Ljh8;->h:Lpc7;

    .line 23
    .line 24
    :cond_1
    return-void
.end method
