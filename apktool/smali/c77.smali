.class public abstract Lc77;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ljm6;

.field public static final b:Ljm6;

.field public static final c:Ljm6;

.field public static final d:Ljm6;

.field public static final e:Ljm6;

.field public static final f:Ljm6;

.field public static final g:Ljm6;

.field public static final h:Ljm6;

.field public static final i:Llt1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lm77;->d:Ljm6;

    .line 2
    .line 3
    sput-object v0, Lc77;->a:Ljm6;

    .line 4
    .line 5
    sget-object v0, Lm77;->h:Ljm6;

    .line 6
    .line 7
    sput-object v0, Lc77;->b:Ljm6;

    .line 8
    .line 9
    sget-object v0, Lm77;->g:Ljm6;

    .line 10
    .line 11
    sput-object v0, Lc77;->c:Ljm6;

    .line 12
    .line 13
    sget-object v0, Lm77;->e:Ljm6;

    .line 14
    .line 15
    sput-object v0, Lc77;->d:Ljm6;

    .line 16
    .line 17
    sget-object v0, Lm77;->f:Ljm6;

    .line 18
    .line 19
    sput-object v0, Lc77;->e:Ljm6;

    .line 20
    .line 21
    sget-object v0, Lm77;->b:Ljm6;

    .line 22
    .line 23
    sput-object v0, Lc77;->f:Ljm6;

    .line 24
    .line 25
    sget-object v0, Lm77;->c:Ljm6;

    .line 26
    .line 27
    sput-object v0, Lc77;->g:Ljm6;

    .line 28
    .line 29
    sget-object v0, Lm77;->a:Ljm6;

    .line 30
    .line 31
    sput-object v0, Lc77;->h:Ljm6;

    .line 32
    .line 33
    sget-object v0, Lm77;->i:Llt1;

    .line 34
    .line 35
    sput-object v0, Lc77;->i:Llt1;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    const/high16 v1, 0x42c80000    # 100.0f

    .line 39
    .line 40
    cmpg-float v0, v1, v0

    .line 41
    .line 42
    if-ltz v0, :cond_0

    .line 43
    .line 44
    cmpl-float v0, v1, v1

    .line 45
    .line 46
    if-lez v0, :cond_1

    .line 47
    .line 48
    :cond_0
    const-string v0, "The percent should be in the range of [0, 100]"

    .line 49
    .line 50
    invoke-static {v0}, Lzc3;->a(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
.end method
