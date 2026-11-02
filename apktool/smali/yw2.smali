.class public abstract Lyw2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lsu2;

.field public static final b:Lcom/google/gson/a;

.field public static final c:Lcom/google/gson/a;

.field public static final d:Lcom/google/gson/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lsu2;

    .line 2
    .line 3
    invoke-direct {v0}, Lsu2;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lsu/happ/proxyutility/util/adapters/FlexibleStringListAdapter;

    .line 7
    .line 8
    invoke-direct {v1}, Lsu/happ/proxyutility/util/adapters/FlexibleStringListAdapter;-><init>()V

    .line 9
    .line 10
    .line 11
    const-class v2, Lsu/happ/proxyutility/dto/FlexibleStringList;

    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, Lsu2;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lyw2;->a:Lsu2;

    .line 17
    .line 18
    new-instance v1, Lcom/google/gson/a;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lcom/google/gson/a;-><init>(Lsu2;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lyw2;->b:Lcom/google/gson/a;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    iput v1, v0, Lsu2;->i:I

    .line 27
    .line 28
    new-instance v1, Lcom/google/gson/a;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lcom/google/gson/a;-><init>(Lsu2;)V

    .line 31
    .line 32
    .line 33
    sput-object v1, Lyw2;->c:Lcom/google/gson/a;

    .line 34
    .line 35
    sget-object v1, Lsj2;->e:Lsj2;

    .line 36
    .line 37
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    iput-object v1, v0, Lsu2;->f:Lsj2;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    iput-boolean v1, v0, Lsu2;->e:Z

    .line 44
    .line 45
    new-instance v1, Lxw2;

    .line 46
    .line 47
    invoke-direct {v1}, Lyi8;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v2, Lww2;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v1, v1, Lyi8;->b:Ljava/lang/reflect/Type;

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Lsu2;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lcom/google/gson/a;

    .line 61
    .line 62
    invoke-direct {v1, v0}, Lcom/google/gson/a;-><init>(Lsu2;)V

    .line 63
    .line 64
    .line 65
    sput-object v1, Lyw2;->d:Lcom/google/gson/a;

    .line 66
    .line 67
    return-void
.end method
