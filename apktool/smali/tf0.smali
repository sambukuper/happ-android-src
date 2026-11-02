.class public abstract Ltf0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lqv;

.field public static final b:Lsv;

.field public static final c:Lsv;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lnr4;->f(I)Lqv;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Ltf0;->a:Lqv;

    .line 7
    .line 8
    new-instance v0, Lsv;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, v0, Lsv;->a:J

    .line 16
    .line 17
    sput-object v0, Ltf0;->b:Lsv;

    .line 18
    .line 19
    new-instance v0, Lsv;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-wide v1, v0, Lsv;->a:J

    .line 25
    .line 26
    sput-object v0, Ltf0;->c:Lsv;

    .line 27
    .line 28
    return-void
.end method
